/* Java Program to find the HCF and LCM of two numbers.*/
import java.util.*;
public class code06 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number = ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number = ");
        int num2 = sc.nextInt();

        int hcf =0, lcm=1;

        for(int i=1;i<num1*num2;i++)
        {
            if(num1 % i==0 && num2%i==0)
            {
                hcf=i;
            }
        }
        for(int i=1;i<num1*num2;i++)
        {
            if(i%num2==0 && i%num2==0)
            {
                lcm =i;
                break;
            }
        }
        System.out.println("The HCF of two numbers are = " + hcf);
        System.out.println("The LCM of two numbers are = " + lcm);

        sc.close();
    }    
}