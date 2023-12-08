// Java Program to display the alternate prime number.
import java.util.*;
public class code02 
{
    static boolean isPrime(int n)
    {
        boolean flag = false;

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            flag = true;
        }
        if(!flag)
        return true;

        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int i=0;
        for(int j=1;j<100;j++)
        {
            if(isPrime(j))
            a[i++] = j;
        }
        for(int j=0;j<a.length;j=j+2)
        {
            if(a[j]!=0)
            System.out.println(a[j]);
        }

        sc.close();
    }

}
