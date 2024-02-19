// Write a Java program to implement a lambda expression to find the largest prime factor of a given number.
import java.util.*;
interface Innercode18{
    int largestPrimeFactor(int num);
}
public class code18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        Innercode18 ob = (n)->{
            int temp=0;
            for(int i=1;i<n;i++)
            {
                if(n%i==0 && isPrime(i))
                temp=i;
            }
            return temp;
        };

        System.out.println("Largest prime factor of " + num + " is " + ob.largestPrimeFactor(num));
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)  return false;
        }
        return true;
    }
}