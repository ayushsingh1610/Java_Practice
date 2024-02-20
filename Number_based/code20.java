// Write a Java program to convert an integer number to a binary number.
import java.util.*;
public class code20
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        System.out.println("Binary is = " + toBinary(n));
    }
    public static String toBinary(int n)
    {
        String num = "";
        while(n>0)
        {
            int r = n%2;
            num = r + num;
            n/=2;
        }
        System.out.println("New number = " + num);

        return num;
    }
}