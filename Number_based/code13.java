/* Java Program to Neon Number*/
import java.util.*;
public class code13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        int sq = n*n;
        int sum=0;
        while(sq>0)
        {
            int r = sq%10;
            sum+=r;
            sq/=10;
        }
        if(n==sum)
        System.out.println(n + " is a Neon number ");

        else
        System.out.println(n + " is NOT a Neon number");

        sc.close();
    }    
}
