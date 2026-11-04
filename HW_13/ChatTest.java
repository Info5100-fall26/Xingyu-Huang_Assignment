import java.io.File;
import java.util.ArrayList;
import java.util.List;
public class ChatTest {
    static int failures=0;
    static void check(boolean condition,String what) {
        System.out.println((condition ? "ok     " : "FAILED ")+what);
        if (!condition) {
            failures++;
        }
    }
    static class FakeUser implements ChatHub.Listener {
        final String name;
        final List<String> lines=new ArrayList<>();
        FakeUser(String name) {
            this.name=name;
        }
        public String getUserName() {
            return name;
        }
        public void receive(String line) {
            lines.add(line);
        }
        boolean got(String part) {
            for (String line : lines) {
                if (line.contains(part)) {
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        File temp=File.createTempFile("users",".txt");
        temp.delete();
        UserStore store=new UserStore(temp.getPath());
        check(store.signUp("alice", "secret1"),"sign up a new user");
        check(!store.signUp("alice", "other99"),"a second sign up with the same name is refused");
        check(!store.signUp("al", "secret1"),"a too short username is refused");
        check(!store.signUp("bob", "123"),"a too short password is refused");
        check(!store.signUp("bad,name", "secret1"),"a username with a comma is refused");
        check(store.signUp("bob", "hunter22"),"sign up a second user");
        check(store.login("alice", "secret1"),"login with the right password");
        check(!store.login("alice", "wrong"),"login with a wrong password is refused");
        check(!store.login("nobody", "secret1"),"login of an unknown user is refused");
        UserStore reopened=new UserStore(temp.getPath());
        check(reopened.login("bob", "hunter22"),"accounts are still there after a restart");
        String saved=new String(java.nio.file.Files.readAllBytes(temp.toPath()));
        check(!saved.contains("secret1") && !saved.contains("hunter22"),"passwords are not saved as text");
        temp.delete();
        ChatHub.reset();
        FakeUser alice=new FakeUser("alice");
        FakeUser bob=new FakeUser("bob");
        ChatHub.join(alice);
        check(ChatHub.isOnline("alice") && !ChatHub.isOnline("bob"),"online check");
        ChatHub.join(bob);
        check(alice.got("bob joined"),"the first user sees that the second one joined");
        ChatHub.send("alice","hello bob");
        check(bob.got("alice: hello bob"),"the second user receives the message");
        check(alice.got("alice: hello bob"),"the sender also sees the message");
        ChatHub.send("bob","hi alice");
        check(alice.got("bob: hi alice"),"the first user receives the answer");
        ChatHub.leave(bob);
        check(alice.got("bob left") && !ChatHub.isOnline("bob"),"leaving is announced");
        FakeUser late=new FakeUser("carol");
        ChatHub.join(late);
        check(late.got("alice: hello bob"),"a window that joins later sees the old messages");
        System.out.println(failures == 0 ? "\nAll chat checks passed." : "\n"+failures+" check(s) FAILED.");
        System.exit(failures == 0 ? 0 : 1);
    }
}
