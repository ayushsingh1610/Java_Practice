// Detect if two integers have opposite signs or not.
import java.util.*;
public class code02
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1 = ");
        int a = sc.nextInt();
        System.out.print("Enter the number 2 = ");
        int b = sc.nextInt();

        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println();

        int n = a^b;
        // System.out.println("a^b = " + Integer.toBinaryString(n));
        
        boolean isOpposite = n<0;
        if(isOpposite)
        System.out.format("%d and %d have Opposite signs.", a,b);
        else
        System.out.format("%d and %d have SAME signs.", a,b);

        sc.close();
    }
}