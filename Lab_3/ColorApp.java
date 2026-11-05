import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class ColorApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame=new JFrame("Lab 3 - Color Circle");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ColorPanel());
            frame.setSize(400,420);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}