// Java Program to find Factorial of a number using Recursion.
import java.util.*;
public class code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        System.out.println("Factorial of the number is = " + factorial(n));
        sc.close();
    }
    static int factorial(int n)
    {
        if(n==1)
        return 1;

        else
        return n*factorial(n-1);
    }
}
