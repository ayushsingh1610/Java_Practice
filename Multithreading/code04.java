// Write a Java Program to print "Good morning" and "Welcome" using threads.
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
        for(int i=1;i<400;i++)
        System.out.println("Welcome");
    }
}
public class code04
{
    public static void main(String args[])
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}