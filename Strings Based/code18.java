
// Java Program to find longest substring without repeating characters.
import java.util.*;

public class code18 {

    static boolean isNOTRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String str = sc.nextLine() + " ";
        String temp = "", maxString = "";
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp = temp + str.charAt(i);
            } else {
                if (isNOTRepeating(temp)) {
                    if (temp.length() > max) {
                        max = temp.length();
                        maxString = temp;
                    }
                }
                temp = "";
                // max=0;
            }

        }

        System.out.println(maxString);
    }
}
