import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class ChatHub {
    public interface Listener {
        String getUserName();
        void receive(String line);
    }
    private static final List<Listener> listeners=new ArrayList<>();
    private static final List<String> history=new ArrayList<>();
    private static final DateTimeFormatter TIME=DateTimeFormatter.ofPattern("HH:mm");
    private ChatHub() {
    }
    public static boolean isOnline(String userName) {
        for (Listener listener : listeners) {
            if (listener.getUserName().equals(userName)) {
                return true;
            }
        }
        return false;
    }
    public static void join(Listener newListener) {
        for (String line : history) {
            newListener.receive(line);
        }
        listeners.add(newListener);
        deliver("* "+newListener.getUserName()+" joined the chat");
    }
    public static void leave(Listener listener) {
        listeners.remove(listener);
        deliver("* "+listener.getUserName()+" left the chat");
    }
    public static void send(String sender,String text) {
        String time=LocalTime.now().format(TIME);
        deliver("[" + time + "] "+sender+": "+text);
    }
    private static void deliver(String line) {
        history.add(line);
        for (Listener listener : new ArrayList<>(listeners)) {
            listener.receive(line);
        }
    }
    public static int onlineCount() {
        return listeners.size();
    }
    static void reset() {
        listeners.clear();
        history.clear();
    }
}
