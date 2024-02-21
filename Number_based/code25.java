// Write a Java program to convert a octal number to a binary number.
import java.util.*;
public class code25
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        System.out.println("Octal to binary = " + OctaltoBinary(n));
    }
    public static String OctaltoBinary(int n)
    {
        return toBinary(OctaltoDecimal(n));
    }   
    public static String toBinary(int n)
    {
        if(n==0) return "0";
        String num = "";
        while(n>0)
        {
            int r = n%2;
            num = r+num;
            n/=2;
        }
        return num;
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