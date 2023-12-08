/*Java Program to Automorphic Number */
import java.util.*;
public class code15
{
    static int countdigit(int n)
    {
        int d=0;
        while(n>0)
        {
            d++;
            n/=10;
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        int sq = n*n;
        int digits = countdigit(n);

        int lastvalues = sq % (int)Math.pow(10,digits);

        if(lastvalues == n)
        System.out.println("Automorphic number ");

        else
        System.out.println("Not a Automorphic number");

        sc.close();

    }    
}
