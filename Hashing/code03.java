// Write a Java program to check whether a map contains key-value mappings (empty) or not.
import java.util.*;
public class code03
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> ob = new HashMap<>();
        ob.put(0, "Ayush");
        ob.put(1, "Aman");
        ob.put(2, null);

        if(ob.containsValue(null))
        System.out.print("Value is Empty");

        else
        System.out.println("Value is not empty");
    }
}