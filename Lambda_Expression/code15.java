// Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
import java.util.*;
interface Innercode15
{
    void calculate(ArrayList<Integer> arr);
}
public class code15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        Innercode15 ob = (a)->{
            int sumeven =0, sumodd=0;

            for(int i=0;i<a.size();i++)
            {
                if(a.get(i)%2==0)   sumeven+= Math.pow(a.get(i),2);
                else    sumodd+= Math.pow(a.get(i),2);
            }
            System.out.println("Sum of All Even number squares = " + sumeven);
            System.out.println("Sum of All Odd numbers squares = " + sumodd);
        };

        ob.calculate(arr);
    }

}