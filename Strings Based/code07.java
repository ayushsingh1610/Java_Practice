// Java program to divide a string in 'n' equal parts.
import java.util.*;
public class code07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the strings = ");
        String str = sc.nextLine();

        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        int l = str.length()/n;
        for(int i=0;i<str.length();i=i+l)
        {
            System.out.println(str.substring(i, i+l));
        }
    }
    
}
