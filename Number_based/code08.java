
/*Java Program to find sunny number. */
import java.util.*;

public class code08 {
    public static boolean isSunny(int n) {
        int sq = (int) Math.sqrt(n + 1);
        if ((n + 1) == sq * sq) {
            return true;
        } else
            return false;
    }

    public static boolean isSunny1(int n) {
        for (int i = 1; i <= n; i++) {
            if ((n + 1) % i == 0) {
                if (i * i == (n + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int number = sc.nextInt();

        if (isSunny1(number))
            System.out.println(number + " is a Sunny number ");

        else
            System.out.println(number + " is not a sunny number");
 
        
        sc.close();
    }

}
