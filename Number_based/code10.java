
/*Java Program to Emrip Number */
import java.util.*;

public class code10 {
    public static int reverse(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = (sum * 10) + r;
            n /= 10;
        }
        return sum;
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        if(isPrime(num) && isPrime(reverse(num)))
        {
            System.out.println(num + " is a Emrip number");
        }
        else
        {
            System.out.println(num + " is not a emrip number");
        }

        sc.close();
    }
}
