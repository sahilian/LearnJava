package Priority;
class Mythread1 extends Thread{
    String threadName;
    public Mythread1(String threadName){
        this.threadName = threadName;
    }

    public void run()
    {
        int i=0;
        while(i<50)
        {
            System.out.println(threadName+" Printing: "+i);
            i++;
        }
    }
}
class Mythread2 extends Thread{
    String threadName;
    public Mythread2(String threadName){
        this.threadName = threadName;
    }

    public void run()
    {
        int i=0;
        while(i<50)
        {
            System.out.println(threadName+" Printing: "+i);
            i++;
        }
    }
}
class Mythread3 extends Thread{
    String threadName;
    public Mythread3(String threadName){
        this.threadName = threadName;
    }

    public void run()
    {
        int i=0;
        while(i<50)
        {
            System.out.println(threadName+" Printing: "+i);
            i++;
        }
    }
}
public class PriorityThreading
{
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1("t1");
        Mythread2 t2 = new Mythread2("t2");
        Mythread3 t3 = new Mythread3("t3");
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }
}