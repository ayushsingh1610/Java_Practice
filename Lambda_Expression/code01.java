// Write a Java program to implement a lambda expression to find the sum of two integers.
import java.util.*;

interface Sum
{
    int calculate(int a, int b);
}
class code01 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num 1 = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num 2 = ");
        int num2 = sc.nextInt();

        Sum ob = (int a,int b)->{
            return a + b;
        };
        System.out.println("Sum of 2 num is = " + ob.calculate(num1, num2));
        
    }
}