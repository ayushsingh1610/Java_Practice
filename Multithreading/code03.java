// Write a Java program that sorts an array of integers using multiple threads.
import java.util.*;

class Bubble_Sort extends Thread
{
    int a[] = {2,9,7,3,4,1};
    public void run()
    {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class Selection_Sort extends Thread
{
    int a[] = {2,9,7,3,4,1};
    public void run()
    {
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            index = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[index]>a[j])   index = j;
            }
            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class Insertion_Sort extends Thread
{
    int a[] = {2,9,7,3,4,1};
    public void run()
    {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j=i-1;

            while(j>=0 && a[j]>key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
            
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
public class code03 
{
    public static void main(String args[])
    {
        Bubble_Sort t1 = new Bubble_Sort();
        Selection_Sort t2 = new Selection_Sort();
        Insertion_Sort t3 = new Insertion_Sort();
        t1.start();
        // t2.start();
        // t3.start();
    }
}