import java.awt.*;
import java.awt.event.*;
import java.util.EventListener;
import javax.swing.*;

public class EventHandling extends JFrame implements ActionListener {
    public EventHandling() {
        super("My Frame");
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


class MyDemo{
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame");
        frame.setSize(400,500);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        JTextField num1 = new JTextField(20);
        JTextField num2 = new JTextField(20);
        JTextField result = new JTextField(20);
        JButton submit = new JButton("Multiply");
        frame.add(num1);
        frame.add(num2);
        frame.add(submit);
        frame.add(result);
        result.setEditable(false);
        frame.setVisible(true);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first = Integer.parseInt(num1.getText());
                int second = Integer.parseInt(num2.getText());
                int multi = first * second;
                result.setText(Integer.toString(multi));
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyFrame extends JFrame implements EventListener, ActionListener {
    int count = 0;
    JLabel label = new JLabel(""+count);
    JButton button = new JButton("Click");
    public MyFrame()
    {
        super("My Frame");
        setLayout(new FlowLayout());
        add(label);
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText(""+count);
    }
}
class Counter{
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(300,300);
        myFrame.setVisible(true);
    }
}