// Java program to sort string in alphabetical order.
import java.util.*;
public class code02 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string = ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        for(char ch = 'a' ; ch <='z';ch++)
        {
            for(int i=0;i<str.length();i++)
            {
                if(ch==str.charAt(i))
                {
                    System.out.print(ch + " ");
                }
            }
        }
    }    
}
