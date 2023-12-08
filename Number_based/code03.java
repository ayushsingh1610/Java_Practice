/*Java Program to break integer into digits. */
import java.util.*;
public class code03 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        while(n>0)
        {
            int r = n%10;
            System.out.print(" " + r);
            n/=10;
        }

        sc.close();
    }    
}
