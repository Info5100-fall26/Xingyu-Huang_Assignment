import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
public class UserStore {
    private final File file;
    private final Map<String, String> users=new HashMap<>();
    public UserStore(String fileName) {
        file=new File(fileName);
        load();
    }
    public static String checkInput(String name,String password) {
        if (!name.matches("[A-Za-z0-9_]{3,15}")) {
            return "Username: 3 to 15 letters, digits or _";
        }
        if (password.length()<4) {
            return "Password: at least 4 characters";
        }
        return null;
    }
    public boolean signUp(String name,String password) {
        if (checkInput(name,password)!=null || users.containsKey(name)) {
            return false;
        }
        users.put(name,hash(password));
        save();
        return true;
    }
    public boolean login(String name,String password) {
        String saved=users.get(name);
        return saved!=null && saved.equals(hash(password));
    }
    public boolean exists(String name) {
        return users.containsKey(name);
    }
    private static String hash(String text) {
        try {
            MessageDigest digest=MessageDigest.getInstance("SHA-256");
            byte[] bytes=digest.digest(text.getBytes("UTF-8"));
            StringBuilder result=new StringBuilder();
            for (byte b : bytes) {
                result.append(String.format("%02x",b));
            }
            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private void load() {
        if (!file.exists()) {
            return;
        }
        try (BufferedReader reader=new BufferedReader(new FileReader(file))) {
            String line;
            while ((line=reader.readLine())!=null) {
                String[] parts=line.split(",");
                if (parts.length==2) {
                    users.put(parts[0],parts[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Could not read "+file+": "+e.getMessage());
        }
    }
    private void save() {
        try (PrintWriter writer=new PrintWriter(new FileWriter(file))) {
            for (Map.Entry<String,String> entry : users.entrySet()) {
                writer.println(entry.getKey()+","+entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("Could not save "+file+": "+e.getMessage());
        }
    }
}