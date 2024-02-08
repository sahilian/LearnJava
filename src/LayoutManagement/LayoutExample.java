package LayoutManagement;

import javax.swing.*;
import java.awt.*;

class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT)); //default alignment is CENTER
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.setVisible(true);
    }
}

class GridLayoutExample
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLayout(new GridLayout(3,2));
        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");
        JButton b6 = new JButton("Button6");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.setVisible(true);
    }
}

class BorderLayoutExample
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Frame");
        frame.setSize(300,300);
        frame.setLayout(new BorderLayout(10,10)); //Yo line narakhepani hunchha because it is the default layout of Frame
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");
        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2,BorderLayout.SOUTH);
        frame.add(b3,BorderLayout.EAST);
        frame.add(b4,BorderLayout.WEST);
        frame.add(b5,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
class BorderLayoutWithGridExample
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Frame");
        frame.setSize(300,300);
        frame.setLayout(new BorderLayout());
        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        /*JButton b3 = new JButton("East");*/
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");
        frame.add(b1,BorderLayout.NORTH);
        frame.add(b2,BorderLayout.SOUTH);
        //frame.add(b3,BorderLayout.EAST);
        frame.add(b4,BorderLayout.WEST);
        frame.add(b5,BorderLayout.CENTER);
        Panel p = new Panel(new GridLayout(3,0));
        JButton t1 = new JButton("Nepal");
        JButton t2 = new JButton("India");
        JButton t3 = new JButton("China");
        p.add(t1);
        p.add(t2);
        p.add(t3);
        frame.add(p,BorderLayout.EAST);
        frame.setVisible(true);
    }
}

class UsingAwtOnly
{
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Frame");
        frame.setLayout(new FlowLayout());
        Label label = new Label("Enter your name");
        TextField textField = new TextField(20);
        Button button = new Button("Submit");
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}

class MyFrame extends Frame
{
    Label l1;
    TextField tf;
    Button b;
    MyFrame()
    {
        super("My Frame");
        l1 = new Label("Enter you name");
        tf = new TextField(20);
        b = new Button("Submit");
        add(l1);
        add(tf);
        add(b);
    }
}
class TestCustomFrame
{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}

class TestCustomFrame2 extends Frame
{
    Label l1;
    TextField tf;
    Button b;
    TestCustomFrame2()
    {
        super("My Frame");
        l1 = new Label("Enter you name");
        tf = new TextField(20);
        b = new Button("Submit");
        add(l1);
        add(tf);
        add(b);
    }
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}

class PanelDemo{
    public static void main(String[] args) {
        Frame f = new Frame("My Frame with Panel");
        f.setLayout(new GridLayout(1,3));
        Panel p = new Panel(new GridLayout(3,1));
        f.setSize(300,300);
        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");
        Button a1 = new Button("Left");
        Button a2 = new Button("Right");
        f.add(a1);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        f.add(p);
        f.add(a2);
        f.setVisible(true);
    }
}

class NoLayoutDemo
{
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(300,300);
        frame.setLayout(null);
        Label l = new Label("Enter Your Name");
        Button b = new Button("Submit");
        TextField tf = new TextField(20);
        l.setBounds(50,50,100,50);
        tf.setBounds(100,70,150,20);
        b.setBounds(150,100,100,20);
        frame.add(l);
        frame.add(b);
        frame.add(tf);
        //frame.setBounds(500,30,100,100); ===> Window chahi kata ani katro dekhauney bhanear specify garney
        frame.setVisible(true);
    }
}

class NoLayoutDemoUsingSwing
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(null);
        JLabel l = new JLabel("Enter Your Name");
        JButton b = new JButton("Submit");
        JTextField tf = new JTextField(20);
        l.setBounds(40,50,100,50);
        tf.setBounds(150,70,140,20);
        b.setBounds(150,100,100,20);
        frame.add(l);
        frame.add(b);
        frame.add(tf);
        //frame.setBounds(500,30,100,100); ===> Window chahi kata ani katro dekhauney bhanear specify garney
        frame.setVisible(true);
    }
}

class MenuDemo
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");
        file.setMnemonic('F');
        JMenuItem save = new JMenuItem("Save");
        JCheckBoxMenuItem check = new JCheckBoxMenuItem("Check", true);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        file.add(save);
        file.add(check);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}