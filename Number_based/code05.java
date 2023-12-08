
/*Java Program to find smallest of three number using ternary.*/
import java.util.*;

public class code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number = ");
        int num2 = sc.nextInt();

        System.out.print("Enter the 3rd number = ");
        int num3 = sc.nextInt();

        int result = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);

        System.out.print("The smallest of three is " + result);

        sc.close();
    }
}
