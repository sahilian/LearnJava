class MyThread2 implements Runnable {
    public void run()
    {
        int i=1;
        while (i<100)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
}

public class MultiThreadingUsingRunnable
{
    public static void main(String[] args)
    {
        MyThread2 test = new MyThread2();
        Thread thread = new Thread(test);
        thread.start();
        int i = 1;
        while (i < 100)
        {
            System.out.println(i + " World");
            i++;
        }
    }
}
