// Write a Java Program to find the LCM of two numbers using Recursion.
import java.util.*;
public class code06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number = ");
        int num2 = sc.nextInt();

        System.out.println("The LCM of two numbers is = " + lcm(num1, num2));
        sc.close();
    }
    static int lcm(int a, int b)
    {
        return (a*b)/gcd(a,b);
    } 
    static int gcd(int a, int b)
    {
        if(b % a==0)
        return a;

        else
        return gcd(b%a,b);
    }

}
