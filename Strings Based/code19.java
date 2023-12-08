// Java Program to replace lower-case characters with upper-case and vice-versa.
import java.util.*;
public class code19 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String str = sc.nextLine();
        String newString = "";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch>'a' && ch<='z')
            {
                newString+=(char)(ch-32);
            }
            else if(ch > 'A' && ch<='Z')
            {
                newString+=(char)(ch+32);
            }
            else
            {
                newString+=ch;
            }
        }
        System.out.println(newString);
    }    
}
