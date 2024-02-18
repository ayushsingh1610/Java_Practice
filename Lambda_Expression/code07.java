// Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
import java.util.*;
interface zeroseven
{
    void run(ArrayList<Integer> arr);
}
class code07
{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(2);

        zeroseven ob = (arr)->{
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<arr.size();i++)
            {
                if(temp.contains(arr.get(i)))
                arr.remove(i);

                else
                temp.add(arr.get(i));
            }
            System.out.println(arr);
        };

        ob.run(a);
    }
}