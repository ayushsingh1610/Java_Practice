// Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
import java.util.*;
interface One{
    String run(String str);
}
public class code03
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.nextLine();

        One ob = (s)->{
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if(Character.isLowerCase(ch))   ch = Character.toUpperCase(ch);
                else if(Character.isUpperCase(ch))   ch = Character.toLowerCase(ch);
                
                ans+=ch;
            }
            return ans;
        };
        
        System.out.println("Converted String is = " + ob.run(str));
    }
}