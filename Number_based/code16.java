/*Java Program to Buzz Number */
import java.util.*;
public class code16 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        if(n%7==0 || n%10==7)
        {
            System.out.println(n + " is a Buzz number");
        }
        else
        System.out.println(n + " is NOT a Buzz number");

        sc.close();
    }    
}
