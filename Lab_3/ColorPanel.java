import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ColorPanel extends JPanel implements ActionListener {
    private final String[] names={"Red","Orange","Yellow","Green","Blue","Purple","Pink"};
    private final Color[] colors={Color.RED,new Color(255,140,0),Color.YELLOW,Color.GREEN,
            Color.BLUE,new Color(128,0,128),Color.PINK};
    private final JComboBox<String> colorBox=new JComboBox<>(names);
    private final JTextField output=new JTextField(12);
    private Color fillColor=null;
    private final JPanel circlePanel=new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int size=Math.min(getWidth(),getHeight())-40;
            int x=(getWidth()-size)/2;
            int y=(getHeight()-size)/2;
            if (fillColor!=null) {
                g.setColor(fillColor);
                g.fillOval(x,y,size,size);
            }
            g.setColor(Color.BLACK);
            g.drawOval(x,y,size,size);
        }
    };
    public ColorPanel() {
        setLayout(new BorderLayout(10,10));
        JPanel top=new JPanel(new FlowLayout());
        top.add(new JLabel("Color:"));
        top.add(colorBox);
        JPanel bottom=new JPanel(new FlowLayout());
        bottom.add(new JLabel("Selected color:"));
        output.setEditable(false);
        bottom.add(output);
        colorBox.setSelectedIndex(-1);
        colorBox.addActionListener(this);
        add(top,BorderLayout.NORTH);
        add(circlePanel,BorderLayout.CENTER);
        add(bottom,BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int index=colorBox.getSelectedIndex();
        if (index>=0) {
            fillColor=colors[index];
            output.setText(names[index]);
            circlePanel.repaint();
        }
    }
}