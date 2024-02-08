import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today);
    }
}

class InputPractice {
    static String name = "Sahil";
    static String surname = "Shrestha";
    static int age;
    int testAge;

    public static void main(String[] args) {
        System.out.println("My name is " + name + " " + surname);
        System.out.printf("My name is %s %s%n", name, surname);
        System.out.println("My age is " + new TestStatic().tester());
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Fist Number:");
        int i = scan.nextInt();
        System.out.println("Enter Second Number:");
        int j = scan.nextInt();
        int sum = i + j;
        System.out.printf("Your input was: %d%n", sum);
        // testAge = 22; ---> Error Because main method is static and testAge is non-static
    }

}

class TestStatic {
    InputPractice ip = new InputPractice();

    int tester() {
        InputPractice.age = 22;
        return InputPractice.age;
    }
}

class NoLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(700, 800);
        JLabel label = new JLabel("Hello World!");
        label.setBounds(100, 100, 300, 60);
        JButton button = new JButton("Click Me!");
        button.setBounds(100, 150, 200, 60);
        frame.add(button);
        frame.add(label);
    }
}

abstract class Animal {
    abstract void makeSound();

    static void sayHello() {
        System.out.println("Hello");
    }
}

interface Mammal {
    public void walk();
}

class Dog extends Animal implements Mammal {
    //must provide implementation of the abstract members
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void walk() {
        System.out.println("Walking");
    }

    public static void main(String[] args) {
        Dog husky = new Dog();
        husky.makeSound();
        Animal.sayHello();
        husky.walk();
    }
}

class SiCalculator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Principle: ");
        String principle = scan.nextLine();
        System.out.println("Enter Time: ");
        String time = scan.nextLine();
        System.out.println("Enter Rate: ");
        String rate = scan.nextLine();
        float p = Float.parseFloat(principle);
        float t = Float.parseFloat(time);
        float r = Float.parseFloat(rate);
        float interest = (p*t*r)/100;
        System.out.println("The interest is: "+interest);
    }
}