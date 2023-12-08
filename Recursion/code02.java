// Write a Java recursive method to calculate the sum of all numbers from 1 to n.
// package java.Recursion;
import java.util.*;
public class code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        System.out.format("Sum of number from 1 to %d is = %d",n, sum(n)); 
        sc.close();
    }
    static int sum(int n)
    {
        if(n==0)
        return 0;

        else
        return n+sum(n-1);
        
    }
}
