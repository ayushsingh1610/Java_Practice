// Java program to find occurance of character in a string.
import java.util.*;
public class code04 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String str = sc.nextLine();

        System.out.print("Enter the character to be found = ");
        char ch = sc.next().charAt(0);
        int freq =0;
        for(int i=0;i<str.length();i++)
        {
            if(ch==str.charAt(i))
            {
                freq++;
            }
        }
        System.out.println("Frequency of " + ch + " is = " + freq);
    }
}
