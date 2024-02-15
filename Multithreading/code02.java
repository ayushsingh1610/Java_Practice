// Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.
import java.util.*;
public class code02 extends Thread
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        code02 even = new code02();
        code02 odd = new code02();
        even.even();
        System.out.println();
        odd.odd();
    }
    public void even()
    {
        for (int i = 0; i < 20; i++) {
            if(i%2==0)  System.out.print(i + " ");
        }
    }
    public void odd()
    {
        for (int i = 0; i < 20; i++) {
            if(i%2!=0)  System.out.print(i + " ");
        }
    }

}