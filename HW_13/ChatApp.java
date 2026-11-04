import javax.swing.SwingUtilities;
public class ChatApp {
    public static void main(String[] args) {
        UserStore store=new UserStore("users.txt");
        SwingUtilities.invokeLater(() -> new LoginWindow(store).setVisible(true));
    }
}
