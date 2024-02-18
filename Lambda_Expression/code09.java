// Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
import java.util.*;
/**
 * Innercode09
 */
interface Innercode09 {
    boolean isPrime(int n);
}
public class code09
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = sc.nextInt();

        Innercode09 ob = (n)->{
            for(int i=2;i<n;i++)
            {
                if(n%i==0)  return false;
            }
            return true;
        };

        if(ob.isPrime(number))  System.out.print("Number is Prime");

        else    System.out.print("Number is NOT Prime");
    }
}