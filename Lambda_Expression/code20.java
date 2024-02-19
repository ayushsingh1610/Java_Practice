// Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.
import java.util.*;
interface Innercode20
{
    void Find_case(List<String> str);
}
public class code20
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        str.add("AYUSH");
        str.add("AMAN");
        str.add("ANKUR");
        str.add("swastik");
        str.add("abhinav");
        str.add("nikhil");

        Innercode20 ob= (s)->{
            if(allUppercase(s))
            System.out.println("List has all Upper case string.");

            else if(allLowercase(s))
            System.out.println("List has all Lower case Strings");

            else
            System.out.println("List has Mixed case.");
        };
        ob.Find_case(str);
    }
    public static boolean allUppercase(List<String> s)
    {   
        for (int i = 0; i < s.size(); i++) {
            if(!isUppercase(s.get(i)))
                return false;
        }
        return true;

    }
    public static boolean allLowercase(List<String> s)
    {   
        for (int i = 0; i < s.size(); i++) {
            if(!isLowercase(s.get(i)))
                return false;
        }
        return true;

    }
    public static boolean isUppercase(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(!(s.charAt(i)>='A' && s.charAt(i)<='Z'))
            return false;
        }
        return true;
    }
    public static boolean isLowercase(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(!(s.charAt(i)>='a' && s.charAt(i)<='z'))
            return false;
        }
        return true;
    }
}