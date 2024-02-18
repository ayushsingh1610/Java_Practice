// Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
import java.util.*;
interface Zerofive
{
    void run(ArrayList<String> message);
}
public class code05
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        str.add("Bob");
        str.add("Justin");
        str.add("Swastik");
        str.add("Ayush");
        str.add("Aman");
        Zerofive ob = (s)->{
            Collections.sort(s);
        };
        ob.run(str);
        System.out.println(str);
        
    }
}