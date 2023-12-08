// Write a Java recursive method to find the sum of the digits of a given integer.
// package java.Recursion;
import java.util.*;
public class code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        System.out.format("Sum of digits of number %d is = %d", n, sumdigit(n));
        sc.close();
    }
    static int sumdigit(int n)
    {
        if(n==0)
        return 0;

        else
        {
            return (n%10) + sumdigit(n/10);
        }
    }
}
