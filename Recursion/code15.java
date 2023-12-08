// Java Program to check Palindrome string using Recursion.
import java.util.*;
public class code15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String = ");
        String str = sc.nextLine();
        String revstr = Reverse(str,str.length() - 1);
        // System.out.println(revstr);
        if(str.compareTo(revstr)==0)
        {
            System.out.println("String is Palindrome.");
        }
        else
        {
            System.out.println("String is not Palindrome ");
        } 
        sc.close();
    }
    static String Reverse(String str, int i)
    {
        if(i==-1)
        return "";

        else
        return str.charAt(i) + Reverse(str,i-1);
    }
    
}
