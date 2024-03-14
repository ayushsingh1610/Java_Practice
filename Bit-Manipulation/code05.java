// Turn off k’th bit in a number.
import java.util.*;
public class code05
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = sc.nextInt();
        System.out.print("Enter the kth position = ");
        int k = sc.nextInt();
        
        System.out.println("Binary of number = " + Integer.toBinaryString(a));
        int off_bit = 1<<(k-1);     // Set the "1" to the kth position
        int set = ~off_bit;         // This set the "0" on the kth position so that we can turn it to zero
        
        int answer = a & set;
        System.out.println("\nAnswer after turnig off the bit on kth position\n");
        System.out.println("Answer in number = " + answer);
        System.out.println("Answer in Binary = " + Integer.toBinaryString(answer));
        
    }
}
/*
 * int shift_left = a<<2;
        int shift_right = a>>2;
        System.out.println("Shift left = " + shift_left);
        System.out.println("Shift right = " + shift_right);
 */