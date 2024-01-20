class MyThread extends Thread
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

public class MultiThreading
{
    public static void main(String[] args)
    {
        MyThread test = new MyThread();
        test.start();
        int i = 1;
        while (i<100)
        {
            System.out.println(i + " World");
            i++;
        }
    }
}
