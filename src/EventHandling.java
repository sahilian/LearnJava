import java.awt.event.*;
import javax.swing.*;

public class EventHandling extends JFrame implements ActionListener {
    public EventHandling() {
        JButton btn = new JButton("Click Me");
        add(btn);
        btn.addActionListener(this);         //registering the event handler
        setSize(100, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Thank you for clicking!");
    }

    public static void main(String[] a) {
        new EventHandling();
    }
}
