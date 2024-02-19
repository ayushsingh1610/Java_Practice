// Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.
import java.util.*;
interface Innercode16{
    void Find(int arr[]);
}
public class code16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length = ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.print("Enter the elements = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Innercode16 ob =(a)->{
            Arrays.sort(a);
            System.out.println("Smallest element is = " + a[0]);
            System.out.println("Second Largest is = " + a[a.length-2]);
        };

        ob.Find(arr);
    }
}
/*
 * For second largest
 * 
 *  int slargest =0, largest=0;
 * for(int i=0;i<a.length;i++)
 * {
 * if(a[i]>largest)
 * {    
 * 
 * }
 * }
 */