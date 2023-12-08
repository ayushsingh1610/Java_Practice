
// Java Program to swap two string variables without using third or temp variable.
import java.util.*;

public class code20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string 1 = ");
        String str1 = sc.nextLine();
        int len1 = str1.length();
        System.out.print("Enter the string 2 = ");
        String str2 = sc.nextLine();

        str1 = str1.concat(str2);
        str2 = str1.substring(0, len1);
        str1 = str1.substring(len1);

        System.out.println("String str 1 = " + str1);
        System.out.println("String str 2 = " + str2);
    }
}
