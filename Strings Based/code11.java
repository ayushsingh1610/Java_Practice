// Java program to remove all white spaces from the string.
import java.util.*;
public class code11 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String str = sc.nextLine();
        String newString = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch!=' ')
            {
                newString+=ch;
            }
        }
        System.out.println(newString);

    }    
}
