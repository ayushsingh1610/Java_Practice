
// Java program to check two string are Anagram is not.
import java.util.*;

public class code06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string = ");
        String str1 = sc.nextLine();

        System.out.print("Enter the 2nd string = ");
        String str2 = sc.nextLine();

        if (arrange(str2).equalsIgnoreCase(arrange(str1))) {
            System.out.println("Strings are Anagram ");
        } else {
            System.out.println("Strings are not Anagram");
        }
    }

    public static String arrange(String str) {
        String s = " ";

        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    s += ch;
                }
            }
        }

        return s;
    }
}
