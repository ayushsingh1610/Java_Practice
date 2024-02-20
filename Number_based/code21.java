// Write a Java program to convert a decimal number to an octal number.
import java.util.*;
public class code21
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        System.out.println("Octal number = " + toOctal(n));
    }
    public static String toOctal(int n)
    {
        String num = "";
        while(n>0)
        {
            int r = n%8;
            num = r + num;
            n/=8;
        }
        return num;
    }
}