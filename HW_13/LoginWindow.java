import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class LoginWindow extends JFrame implements ActionListener {
    private final UserStore store;
    private final JTextField nameField=new JTextField();
    private final JPasswordField passwordField=new JPasswordField();
    private final JButton loginButton=new JButton("Log in");
    private final JButton signUpButton=new JButton("Sign up");
    private final JLabel status=new JLabel("Sign up first, then log in.",SwingConstants.CENTER);
    public LoginWindow(UserStore store) {
        super("Chat - Sign up / Log in");
        this.store=store;
        JPanel form=new JPanel(new GridLayout(4,2,8,8));
        form.setBorder(javax.swing.BorderFactory.createEmptyBorder(15,15,15,15));
        form.add(new JLabel("Username:"));
        form.add(nameField);
        form.add(new JLabel("Password:"));
        form.add(passwordField);
        form.add(loginButton);
        form.add(signUpButton);
        form.add(new JLabel(""));
        form.add(new JLabel(""));
        add(form,java.awt.BorderLayout.CENTER);
        add(status,java.awt.BorderLayout.SOUTH);
        loginButton.addActionListener(this);
        signUpButton.addActionListener(this);
        passwordField.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360,240);
        setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name=nameField.getText().trim();
        String password=new String(passwordField.getPassword());
        if (e.getSource()==signUpButton) {
            String problem=UserStore.checkInput(name,password);
            if (problem!=null) {
                status.setText(problem);
            } else if (store.signUp(name,password)) {
                status.setText("Account created. You can log in now.");
            } else {
                status.setText("This username is already taken.");
            }
        } else {
            if (!store.login(name,password)) {
                status.setText("Wrong username or password.");
            } else if (ChatHub.isOnline(name)) {
                status.setText(name+" is already logged in.");
            } else {
                new ChatWindow(name);
                nameField.setText("");
                passwordField.setText("");
                status.setText(name+" logged in. The second user can log in now.");
            }
        }
    }
}