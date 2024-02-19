// Write a Java program to implement a lambda expression to check if a given number is a perfect square.
import java.util.*;
/**
 * Innercode17
 */
interface Innercode17 {
    boolean isSquare(int num);
}
public class code17
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        Innercode17 ob = (n)->{
            for(int i=1;i<n;i++)
            {
                if(i*i==n)      return true;
            }
            return false;
        };
        if(ob.isSquare(num))
        System.out.println(num + " is a Perfect Square.");

        else 
        System.out.println(num + " is NOT is Perfect Square.");
    }
}