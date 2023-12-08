// Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
import java.util.*;
public class code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        input(n);
    }
    public static void input(int n)
    {
        if(n%2!=0)
        {
            throw new ArithmeticException("Number is Odd");
        }
        else
        {
            System.out.println("Number is EVEN");
        }
    }
}
