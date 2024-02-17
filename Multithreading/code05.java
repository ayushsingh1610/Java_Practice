// Write a sleep method in welcome thread to dealy the execution.
class MyThread1 extends Thread
{
    public void run()
    {   
        for(int i=1;i<400;i++)
        System.out.println("Good Morning");
    }
}
class MyThread2 extends Thread
{
    public void run()
    {   
        try {
            Thread.sleep(200);          // It delays the Welcome thread
            for(int i=1;i<400;i++)
            System.out.println("Welcome");
        } catch (Exception e) {
            System.out.println(e);
        }   
    }
}
public class code05
{
    public static void main(String args[])
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}