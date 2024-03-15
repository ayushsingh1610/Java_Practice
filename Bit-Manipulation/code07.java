// Check if k’th bit is set for a number.
import java.util.*;
public class code07
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        System.out.print("Enter the kth position = ");
        int k = sc.nextInt();

        int temp = 1<<(k-1);
        int bit = n & temp;
        System.out.println(bit);
        if(bit==1)
        System.out.println("Bit is Set for number");
        else
        System.out.println("Bit is NOT set for number.");
    }
}