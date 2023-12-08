// Write a Java recursive method to count the number of occurrences of a specific element in an array.
import java.util.*;
public class code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of element = ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the Elements = ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number whose occurance is to be found = " );
        int found = sc.nextInt();

        System.out.println("Occurance of number is = " + frequency(a,n-1,found,1));
        sc.close();

    }
    static int frequency(int a[], int n, int found,int count)
    {
        if(n<0)
        return 0;

        else
        {
            if(a[n]==found)
            return count+frequency(a, n-1, found, count);

            else
            return frequency(a, n-1, found,count);
        }
    }
}
