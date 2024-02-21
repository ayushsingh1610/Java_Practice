// Write a Java program to convert a hexadecimal value into a decimal number.
import java.util.*;
public class code26
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        String n = sc.nextLine();
        System.out.println("Conversion of Hexadecimal to Decimal = " + hex_to_decimal(n));
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
}