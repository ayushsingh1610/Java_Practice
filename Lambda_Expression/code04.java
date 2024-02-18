// Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
import java.util.*;

interface One{
    void run(ArrayList<Integer> arr);
}
public class code04
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>(10);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        One ob = (arr)-> {
            ArrayList<Integer> even = new ArrayList<>(10);
            ArrayList<Integer> odd = new ArrayList<>(10);
            for (int j = 0; j < arr.size(); j++) {
                if(arr.get(j) % 2==0)     
                even.add(arr.get(j));

                else    
                odd.add(arr.get(j));
            }
            System.out.println("Even number are = " + even);
            System.out.println("Odd numbers are = " + odd);
        };
        // System.out.println(a);
        ob.run(a);
    }
}