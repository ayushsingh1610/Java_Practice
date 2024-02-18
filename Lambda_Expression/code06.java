// Write a Java program to implement a lambda expression to find the average of a list of doubles.
import java.util.*;
interface zerosix
{
    void run(ArrayList<Double> arr);
}
public class code06
{
    public static void main(String args[])
    {
        ArrayList<Double> a = new ArrayList<>();
        a.add(11.00);
        a.add(12.00);
        a.add(13.00);
        a.add(15.00);
        a.add(16.00);
        a.add(22.00);
        a.add(24.00);
        a.add(45.00);
        a.add(44.00);

        zerosix ob = (arr)->{
            double sum =0;
            for (int i = 0; i < arr.size(); i++)
                sum+=arr.get(i);

            System.out.print(sum/arr.size());
        };
        System.out.print("Average of Numbers is = ");
        ob.run(a);
    }
}