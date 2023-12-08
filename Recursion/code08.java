// Write a Java recursive method to find the maximum element in an array.
import java.util.*;
public class code08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements = ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements = ");
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        System.out.println("Maximum element in array is = " + maximum(a,n-1));
        sc.close();
    }
    public static int maximum(int a[], int n)
    {

        if(n==0)
        return a[0];

        else
        {
            return Math.max(a[n-1],maximum(a,n-1));
        }
    }
}
