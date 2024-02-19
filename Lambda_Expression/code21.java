// Write a Java program to implement a lambda expression to find the average length of strings in a list.
import java.util.*;
/**
 * Innercode21
 */
interface Innercode21 {
    void average_length(List<String> str);    
}
public class code21
{
    public static void main(String args[])
    {
        List<String> str = new ArrayList<>();
        str.add("AYUSH");
        str.add("AMAN");
        str.add("ANKUR");
        str.add("swastik");
        str.add("abhinav");
        str.add("nikhil");

        Innercode21 ob =(s)->{
            int sum=0;
            for(int i=0;i<s.size();i++)
            {
                String temp = s.get(i);
                sum+=temp.length();
            }
            System.out.println("Average length is = " + sum/s.size());
        };
        ob.average_length(str);
    }
}