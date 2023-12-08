/*Java Program to Spy number */
import java.util.*;
public class code11
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the the number = ");
        int num = sc.nextInt();

        int sum=0, product = 1;

        while(num>0)
        {
            int r = num%10;
            sum+=r;
            product*=r;
            num/=10;
        }
        if(sum == product)
        {
            System.out.println("This is a Spy number ");
        }
        else
        {
            System.out.println("Thsi is NOT a spy number ");
        }

        sc.close();
    }    
}
