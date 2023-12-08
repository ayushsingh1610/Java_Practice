// Java program to reverse word in a string.
import java.util.*;
public class code03 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String str = sc.nextLine();
        String word = " ";
        String strrev = " ";

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch!=' ')
            {
                word+=ch;
            }
            else 
            {
                strrev = word + strrev;
                word = " ";
            }
            
        }
        System.out.println(strrev);
    }
}
