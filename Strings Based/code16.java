
// Java Program to print smallest and biggest possible palindrome word in given strings.
import java.util.*;

public class code16 {

    public static boolean isPalindrome(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ')
                temp = ch + temp;
        }
        if (temp.equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String str = sc.nextLine() + " ";
        int Maximum = 0, Minimum = str.length();
        String temp = "", max = "", min = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                temp += ch;
            } else {
                if (isPalindrome(temp)) {
                    if (temp.length() > Maximum) {
                        Maximum = temp.length();
                        max = temp;
                    }

                    if (temp.length() < Minimum) {
                        Minimum = temp.length();
                        min = temp;
                    }
                }
                temp = "";

            }
        }
        System.out.println("Maximum length word = " + max);
        System.out.println("Minimum length word = " + min);
    }
}