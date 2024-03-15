// Turn on k’th bit in a number.
import java.util.*;
public class code06
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        System.out.print("Enter the kth position = ");
        int k = sc.nextInt();

        int temp = 1<<(k-1);
        int answer = n | temp;
        System.out.println("\nBinary of number = " + Integer.toBinaryString(n));
        System.out.println("\nAnswer = " + answer);
        System.out.println("Binary of Answer = " + Integer.toBinaryString(answer));
    }
}