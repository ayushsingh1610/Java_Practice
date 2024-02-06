// Write a Java program to get a shallow copy of a HashMap instance.
import java.util.*;
public class code04
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> ob = new HashMap<>();
        ob.put(1,"Ayush");
        ob.put(2,"Singh");
        ob.put(3,"Akki");

        System.out.println(ob);
        System.out.println(ob.clone());
    }
}