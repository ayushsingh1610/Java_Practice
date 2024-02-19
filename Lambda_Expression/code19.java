// Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
import java.util.*;
interface Innercode19{
    void printLength(String str);
}
public class code19
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.nextLine();

        Innercode19 ob = (s)->{
            int smallest_length =s.length(), longest_length=0;
            String temp_word = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if(ch!=' ')
                {
                    temp_word +=ch;
                }
                else
                {
                    if(temp_word.length()>longest_length)
                    longest_length = temp_word.length();

                    if(temp_word.length()<smallest_length)
                    smallest_length = temp_word.length();

                    temp_word = "";
                }
            }
            System.out.println("Smallest length is = " + smallest_length);
            System.out.println("Longest length is = " + longest_length);

        };
        ob.printLength(str);
    }
     
}