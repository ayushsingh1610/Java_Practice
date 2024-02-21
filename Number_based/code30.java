// Write a Java program to convert a decimal number to a hexadecimal number.
import java.util.*;
public class code30
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        System.out.println("Conversion of decimal to Hexadecimal = " + dec_to_hex(n));
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
}