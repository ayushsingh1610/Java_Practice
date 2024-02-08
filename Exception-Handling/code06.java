// Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.
import java.util.*;
public class code06
{
    public static void main(String args[])
    {
        int nums[] = new int[5];
        Input(nums);
        if(isDuplicate(nums))
        {
            throw new ArithmeticException("List contains Duplicates");
        }
        else
        System.out.print("List Does not contain Duplicate");

    }
    public static void Input(int nums[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements = ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
    }
    public static boolean isDuplicate(int nums[])
    {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(a.contains(nums[i]))     return true;

            a.add(nums[i]);
        }
        return false;
    }
}