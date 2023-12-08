// Write a program to reverse a number using recursion.
// package java.Recursion;
import java.util.*;
public class code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        System.out.println("Reverse of number is = ");
        reverse(n);
        sc.close();
    }
    public static void reverse(int n )
    {
        if(n>0)
        {
            System.out.print(n%10);
            reverse(n/10);
        }
    }
    
}
