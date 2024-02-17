// How do you get state of thread in java.
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
        for(int i=1;i<400;i++)
        System.out.println("Welcome");
    }
}
public class code07
{
    public static void main(String args[])
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.setPriority(3);
        t2.setPriority(9);
        // t1.start();
        System.out.println("\nThread state is = " + t1.getState());
    }
}