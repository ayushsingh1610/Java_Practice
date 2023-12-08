/* Java Program to Duck Number*/
import java.util.*;
public class code17 
{
    static int digit(int n)
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
        int n1=n;
        boolean flag = false;
        int firstvalue = n % (int)Math.pow(10,digit(n1)-1);
        while(n>0)
        {
            if(firstvalue!=0)
            {
                int r = n%10;
                if(r==0)
                {
                    flag = true;
                    break;
                }
                n/=10;
            }
        }
        if(flag)
        {
            System.out.println(n1 + " is a duck number");
        }
        else
        {
            System.out.println(n1 + " is Not a Duck number");
        }

        sc.close();
    }    
}
