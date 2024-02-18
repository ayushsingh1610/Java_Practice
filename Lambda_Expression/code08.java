// Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
import java.util.*;
/**
 * Innercode08
 */
interface Innercode08 {
    int run(int n);
}
public class code08
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        Innercode08 ob = (n)->{
            int f=1;
            for (int i = 1; i <= n; i++) {
                f*=i;
            }
            return f;
        };

        System.out.printf("Factorial of %d is = %d ", num, ob.run(num));

        sc.close();
    }
}