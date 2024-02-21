// Write a Java program to convert a hexadecimal value into an octal number.
import java.util.*;
public class code29
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hex number = ");
        String n = sc.nextLine();
        System.out.println("Conversion of hex to Binary = " + hex_to_octal(n));
    }
    public static String hex_to_octal(String n)
    {
        return toOctal(hex_to_decimal(n));
    }
    public static int hex_to_decimal(String n)
    {
        int num =0,p=0;

        for(int i = n.length()-1;i>=0;i--)
        {
            char ch = n.charAt(i);
            if(ch>='A' && ch<='F')
            {
                num = num + ((int)ch -55)*(int)Math.pow(16,p);
            }
            else
            {
                num = num + Character.getNumericValue(ch)*(int)Math.pow(16,p);
            }
            p++;
        }
        return num;
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