import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class ChatWindow extends JFrame implements ActionListener, ChatHub.Listener {
    private static int windowCount=0;
    private final String userName;
    private final JTextArea history=new JTextArea();
    private final JTextField input=new JTextField();
    private final JButton sendButton=new JButton("Send");
    public ChatWindow(String userName) {
        super("Chat - "+userName);
        this.userName=userName;
        history.setEditable(false);
        history.setLineWrap(true);
        history.setWrapStyleWord(true);
        JPanel bottom=new JPanel(new BorderLayout(5,5));
        bottom.add(input,BorderLayout.CENTER);
        bottom.add(sendButton,BorderLayout.EAST);
        add(new JScrollPane(history),BorderLayout.CENTER);
        add(bottom,BorderLayout.SOUTH);
        sendButton.addActionListener(this);
        input.addActionListener(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ChatHub.leave(ChatWindow.this);
            }
        });
        setSize(380,420);
        setLocation(60+windowCount*420,120);
        windowCount++;
        ChatHub.join(this);
        setVisible(true);
        input.requestFocusInWindow();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String text=input.getText().trim();
        if (!text.isEmpty()) {
            ChatHub.send(userName,text);
            input.setText("");
        }
    }
    @Override
    public String getUserName() {
        return userName;
    }
    @Override
    public void receive(String line) {
        history.append(line+"\n");
        history.setCaretPosition(history.getDocument().getLength());
    }
    String getHistoryText() {
        return history.getText();
    }
    void typeAndSend(String text) {
        input.setText(text);
        sendButton.doClick();
    }
}