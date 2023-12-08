// Java Program to swap two numbers using bitwise operator
import java.util.*;
public class code19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number - ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number - ");
        int num2 = sc.nextInt();

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("1st number = " + num1);
        System.out.println("2nd number = " + num2);
    }
}
