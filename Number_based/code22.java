// Write a Java program to convert a binary number to a decimal number.
import java.util.*;
public class code22
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        
        System.out.println("Decimal number = " + toDecimal(n));
    }
    public static int toDecimal(int n )
    {
        int i=0,num =0;
        while(n>0)
        {
            int r = n%10;
            num = num + (int)Math.pow(2,i)*r;
            n/=10;
            i++;
        }
        return num;
    }
}