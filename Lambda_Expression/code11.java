// Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
import java.util.*;
interface Innercode11
{
    void MaxorMin(ArrayList<Integer> a);
}
public class code11
{
    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(7);

        Innercode11 ob = (arr)->{
            Collections.sort(arr);
            System.out.println("Minimum value is = " + arr.get(0));
            System.out.println("Maximum value is = " + arr.get(arr.size()-1));
        };
        ob.MaxorMin(a);
    }
}