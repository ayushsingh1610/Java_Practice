// Write a Java program to implement a lambda expression to check if a given string, is a palindrome.
import java.util.*;
interface Innercode14
{
    boolean isPalindrome(String str);
}
public class code14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String = ");
        String str = sc.nextLine();
        

        Innercode14 ob = (s)->{
            s.toLowerCase();
            for(int i=0;i<s.length()/2;i++)
            {
                if(s.charAt(i)!=s.charAt(s.length()-i-1))     return false;
            }
            return true;
        };
        if(ob.isPalindrome(str))
        System.out.println(str + " is Palindrome string.");

        else
        System.out.println(str + " is NOT a Palindrome string.");
    }
}