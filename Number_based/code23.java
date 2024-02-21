// Write a Java program to convert a binary number to an octal number.
import java.util.*;
public class code23
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number = ");
        int n = sc.nextInt();
        System.out.println("Binary to Octal = " + Binary_to_Octal(n));
    }
    public static String Binary_to_Octal(int n)
    {
        if(n<1000)  return "";
        String num ="";
        while(n>0)
        {
            int r = n%1000;
            num = String.valueOf(toDecimal(r)) + num;
            n/=1000;
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