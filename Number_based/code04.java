/*Java Program to print Armstrong number between a given range. */
import java.util.*;
public class code04 
{
    static int digits(int n)
    {
        int digits=0;
        while(n>0)
        {
            digits++;
            n/=10;
        }
        return digits;
    }
    public static boolean isArmstrong(int n)
    {
        int num=n;
        int sum =0;
        int d = digits(n);
        while(n>0)
        {
            int r= n%10;
            sum+=Math.pow(r,d);
            n/=10;
        }
        if(sum==num)
        return true;

        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number = ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number = ");
        int end = sc.nextInt();
        
        System.out.format("Armstrong Numbers in range %d and %d are = ",start,end);
        for(int i = start ;i<end;i++)
        {
            if(isArmstrong(i))
            System.out.format("%d  ",i);
        }

        sc.close();
    }
}
