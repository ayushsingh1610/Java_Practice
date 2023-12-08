// Java Program to determine whether one string is a rotation of another.
import java.util.*;
public class code12 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st the String = ");
        String str1 = sc.nextLine();

        System.out.print("Enter the 2nd String = ");
        String str2 = sc.nextLine();

        String str = str1 + str1;

        if(str1.length()!=str2.length())
        {
            System.out.println("String are not be in rotation");
        }
        /*else
        {
            int n = str1.length();
            for(int i=0;i<str1.length();i++)
            {
                char ch = str2.charAt(i);
                if(str.substring(i,i+n).equals(str2))
                {
                    System.out.format("%s is rotation of %s\n", str2,str1);
                    break;
                }
                else
                {
                    System.out.println("String are not rotation of each other.");
                    break;
                }
            }
        } */

        else
        {
            char ch = str2.charAt(0);
            int loc =0;
            for(int i=0;i<str.length();i++)
            {
                if(ch==str.charAt(i))
                {
                    loc = i;
                    break;
                }
            }
            if(str.substring(loc, loc+str1.length()).equals(str2))
            {
                System.out.format("%s is rotation of %s\n", str2,str1);
            }
            else
            {
                System.out.println("String are not rotation of each other.");
            }
        }

    }    
}
