// Swap two numbers without using any third variable.
import java.util.*;
public class code04
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 = ");
        int a = sc.nextInt();
        System.out.print("Enter the number 2 = ");
        int b = sc.nextInt();

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("\nAfter Swapping \n");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}