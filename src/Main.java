import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
class InputPractice
{
    static String name = "Sahil";
    static String surname = "Shrestha";
    static int age;
    int testAge;
    public static void main(String[] args)
    {
        System.out.println("My name is "+name+" "+surname);
        System.out.printf("My name is %s %s%n",name,surname);
        System.out.println("My age is "+new TestStatic().tester());
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fist Number:");
        int i = scan.nextInt();
        System.out.println("Enter Second Number:");
        int j = scan.nextInt();
        int sum = i + j;
        System.out.printf("Your input was: %d%n",sum);
        // testAge = 22; ---> Error Because main method is static and testAge is non-static
    }

}
class TestStatic
{
    InputPractice ip = new InputPractice();
    int tester()
    {
        InputPractice.age = 22;
        return InputPractice.age;
    }
}

class NoLayout
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JLabel label = new JLabel("Hello World!");
        frame.setLayout(null);
        frame.setSize(700,800);
        label.setBounds(100,100,300,60);
        frame.add(label);
    }
}