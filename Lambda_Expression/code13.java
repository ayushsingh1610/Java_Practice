// Write a Java program to implement a lambda expression to count words in a sentence.
import java.util.*;
interface Innercode13
{
    int count(String str);
}
public class code13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        

        Innercode13 ob = (s)->{
            int count =1;
            for(int i=0;i<s.length();i++)
            {
                char ch = s.charAt(i);

                if(ch==' ')     count++;
            }
            return count;
        };
        System.out.println("Number of words is = " + ob.count(str));
    }
}