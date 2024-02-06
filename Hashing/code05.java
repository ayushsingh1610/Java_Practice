// Write a Java program to test if a map contains a mapping for the specified key.
import java.util.*;
public class code05
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> ob = new HashMap<>();
        ob.put(1, "Ayush");
        ob.put(2, "Aman");
        ob.put(3, "Swastik");
        ob.put(4,"Ankur");
        System.out.print("Enter the key = ");
        int key = sc.nextInt();
        
        if(ob.containsKey(key))
        System.out.println("Yes At " + key + " Value is Present");

        else
        System.out.println("No there is No key Present.");

    }
}