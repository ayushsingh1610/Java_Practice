
/*Java Program to Sphenic Number. */
import java.util.*;

public class code18 {

    static boolean isPrime(int n) {
        boolean flag = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                flag = true;
        }
        if (!flag)
            return true;

        else
            return false;
    }

    public static boolean isSphenic(int n) {
        int product = 1, c = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    // System.out.println(i);
                    product *= i;
                    c++;
                }
            }
        }
        if (product == n && c == 3)
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        if (isSphenic(num))
            System.out.format("%d is Sphenic number.", num);

        else
            System.out.printf("%d is NOT a Sphenic number", num);

        sc.close();
    }
}
