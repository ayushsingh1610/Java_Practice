/*Java Program to find Peterson number. */
import java.util.*;
public class code07 
{
    public static int isFactorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int number = sc.nextInt();
        int backup = number;
        int sum=0;
        while(number>0)
        {
            int r = number%10;
            sum+= isFactorial(r);
            number/=10;
        }
        if(sum==backup)
        System.out.println("Number is Peterson");

        else
        System.out.println("Number is not Peterson");

        sc.close();
    }    
}
