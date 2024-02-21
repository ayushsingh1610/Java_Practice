// Write a Java program to convert a binary number to a hexadecimal number.
import java.util.*;
public class code31
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        System.out.println("Conversion of binary to hexadecimal = " + binarytoHex(n));
    }
    public static String binarytoHex(int n)
    {
        return dec_to_hex(toDecimal(n));
    }
    public static String dec_to_hex(int n)
    {
        String num = "";
        while(n>0)
        {
            int r = n%16;
            if(r>9)
            num = (char)(r+55) + num;
            
            else
            num = r+num;

            n/=16;
        }
        return num;
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