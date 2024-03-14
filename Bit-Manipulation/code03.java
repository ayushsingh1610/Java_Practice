// Add 1 to an integer.
import java.util.*;
public class code03
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = sc.nextInt();
        System.out.println("a = " + Integer.toBinaryString(a));
        
        int invert = ~a + 1;
        System.out.format("Invert = %d\nBinary = %s",invert,Integer.toBinaryString(invert));
        
    }
}