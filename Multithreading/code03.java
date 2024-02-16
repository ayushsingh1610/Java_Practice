// Write a Java program that sorts an array of integers using multiple threads.
import java.util.*;
public class code03 extends Thread
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(9);
        a.add(7);
        a.add(1);
        code03 ob = new code03();
        ob.run(a);
        System.out.println(a);
    }
    void run(List<Integer> a)
    {
        Collections.sort(a);
    }
}