// Java Program to Reverse a String using Recursion.
import java.util.*;

public class code14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string = ");
        String str = sc.nextLine();
        int len = str.length();
        Reverse(str,len-1);
        sc.close();
    }
    static void Reverse(String str, int i)
    {
        // Condition is set on i==-1 otherwise it will return the String without printing letter on position 0.
        if(i==-1)
        return;

        else
        {
            System.out.print(str.charAt(i));
            Reverse(str, i-1);
        }

    }
}
