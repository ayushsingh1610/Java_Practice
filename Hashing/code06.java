// Write a Java program to get a set view of the keys contained in this map.
import java.util.*;
public class code06
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> ob = new HashMap<>();
        ob.put(1, "Ayush");
        ob.put(2, "Aman");
        ob.put(3, "Swastik");
        ob.put(4,"Ankur");

        Set keySet = ob.keySet();
        
        Collection cl = ob.values();

        System.out.println(keySet);
        System.out.println(cl);

    }
}