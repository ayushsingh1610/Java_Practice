// Write a Java program to implement a lambda expression to convert an integer to their corresponding binary representation.
import java.util.*;
interface Innercode22
{
    void ToBinary(int num);
}
public class code22
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        Innercode22 ob = (n)->{
            System.out.println("Binary representation is = " + Integer.toBinaryString(n));
        };
        ob.ToBinary(num);
    }
}