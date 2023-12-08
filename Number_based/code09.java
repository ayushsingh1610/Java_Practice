/*Java Program to Tech Number */
import java.util.*;
public class code09 
{
    static int digits(int n)
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

        int num1, num2, digit;
        
        System.out.println("Enter the number = ");
        int num = sc.nextInt();
        int square=0;
        digit = digits(num);

        if(digit%2==0)
        {
            num1 = num / (int )Math.pow(10,digit/2);
            num2 = num %(int)Math.pow(10,digit/2);

            square =(int)Math.pow((num1+num2),2);
        }

        if(num == square)
        {
            System.out.println("This is a Tech number is = " + square);
        }
        else
        System.out.println("This is not a tech number.");

        sc.close();
    }    
}
