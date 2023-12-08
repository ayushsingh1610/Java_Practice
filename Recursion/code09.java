// Write a Java recursive method to find the sum of all odd numbers in an array.
import java.util.*;
public class code09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements = ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the elements = ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Sum of odd elements of array = " + Sum(a,n-1));
        sc.close();
    }
    static int Sum(int a[], int n )
    {
        if(n<0)
        return 0;

        else
        {
            if(a[n]%2!=0)
            {
                return  a[n] + Sum(a,n-1);
            }
            else
            {
                return Sum(a,n-1);
            }
            
        }
    }
}
