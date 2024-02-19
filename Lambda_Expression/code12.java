// Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
import java.util.*;
interface Innercode12
{
    void calculate(ArrayList<Integer> a);
}
public class code12
{
    public static void main(String args[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(7);

        Innercode12 ob = (arr)->{
            int sum=0, multiply=1;
            for (int i = 0; i < arr.size(); i++) {
                sum+=arr.get(i);
                multiply*=arr.get(i);
            }
            System.out.println("Sum of all integer is = " + sum);
            System.out.println("Multiply of all integers = " + multiply);
        };
        ob.calculate(a);
    }
}