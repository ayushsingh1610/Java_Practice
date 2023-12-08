// Java Program to count the no. of words in a string.
import java.util.*;
public class code15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String str = sc.nextLine();

        int spaces = 0;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch==' ')
            spaces++;
        }
        System.out.println("Total words in a give string is " + (spaces+1));
    }
}
