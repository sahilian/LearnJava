class MyThread1 extends Thread
{
    public void run()
    {
        int i = 1;
        while (i<100)
        {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

public class MultiThreadingUsingThread
{
    public static void main(String[] args)
    {
        MyThread1 test = new MyThread1();
        test.start();
        int i = 1;
        while (i<100)
        {
            System.out.println(i + " World");
            i++;
        }
    }
}
