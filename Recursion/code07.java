// Write a Java recursive method to calculate the product of all numbers in an array.
import java.util.*;
public class code07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5};
        
        // System.out.print("Enter the element in array = ");
        /*for(int i=0;i<10;i++)
        {
            int a[i] = sc.nextInt();
        } */

        System.out.print("The product of all elements are = " + product(a,5));
        sc.close();
        sc.close();
    }
    public static int product(int a[],int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return a[n-1]*product(a,n-1);
        }
        
    }
}
