// Write a Java program to convert a binary number to an octal number.
import java.util.*;
public class code23
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number = ");
        int n = sc.nextInt();
        System.out.println("BInart to Octal = " + Binary_to_Octal(n));
    }
    public static int Binary_to_Octal(int n)
    {
        int num =0;

        while(n>0)
        {
            int r = n%1000;
            num+= toBinary(r);
            n/=1000;
        }
        return num;
    }
    public static int toBinary(int n)
    {
        int num = 0;
        while(n>0)
        {
            int r = n%2;
            num = (r*10) + num;
            n/=2;
        }
        return num;
    }
}