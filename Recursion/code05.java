// Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.
import java.util.*;
public class code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number = ");
        int num2 = sc.nextInt();

        System.out.println("The gcd of two numbers are = " + gcd(num1, num2));
        sc.close();
    }
    static int gcd(int a,int b)
    {
        if(b%a==0)
        return a;

        else
        return gcd(b%a,b);
    }
}
