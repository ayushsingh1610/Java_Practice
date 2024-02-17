// How do you get reference to current thread in java.
class MyThread1 extends Thread
{
    public void run()
    {   
        // for(int i=1;i<400;i++)
        System.out.println("Good Morning");
    }
}
class MyThread2 extends Thread
{
    public void run()
    {   
        // for(int i=1;i<400;i++)
        System.out.println("Welcome");
    }
}
public class code08
{
    public static void main(String args[])
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setPriority(3);
        t2.setPriority(9);
        t1.start();
        // t2.start();
        System.out.println("\nCurrent Thread is = ");
        System.out.println(Thread.currentThread().getState());
        
    }
}