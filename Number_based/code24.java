// Write a Java program to convert a octal number to a decimal number.
import java.util.*;
public class code24
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        System.out.println("Octal to Decimal = " + OctaltoDecimal(n));
    }
    public static int OctaltoDecimal(int n )
    {
        int i=0,num =0;
        while(n>0)
        {
            int r = n%10;
            num = num + (int)Math.pow(8,i)*r;
            n/=10;
            i++;
        }
        return num;
    }
}