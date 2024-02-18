// Write a Java program to implement a lambda expression to concatenate two strings.
import java.util.*;
/**
 * Innercode10
 */
interface Innercode10 {

    String concatenate(String s1, String str2);
}
public class code10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string 1 = ");
        String str1 = sc.nextLine();
        System.out.print("Enter the string 2 = ");
        String str2 = sc.nextLine();

        Innercode10 ob = (s1,s2)->{
            return s1 +" " + s2;
        };

        System.out.println("After concatenation  = " + ob.concatenate(str1, str2));
    }
}