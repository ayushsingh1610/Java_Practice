
// Java Program to compare strings.
import java.util.*;

public class code14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string = ");
        String str1 = sc.nextLine();

        System.out.print("Enter the 2nd string = ");
        String str2 = sc.nextLine();

        System.out.println(
                "Enter the choice...\n\nPress 1 for using equals function\nPress 2 for using logic\nPress 3 for using compareTo function");
        int n = sc.nextInt();

        switch (n) {
            case 1: {
                if (str1.equals(str2)) {
                    System.out.println("Both strings are equals");
                } else {
                    System.out.println("Both string are NOT equals");
                }
                break;
            }
            case 2: {
                boolean flag = false;
                for (int i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) != str2.charAt(i)) {
                        flag = true;
                    }
                }
                if (!flag)
                    System.out.println("Both strings are equals");

                else
                    System.out.println("Both string are NOT equals");

                break;
            }
            case 3: {
                if (str1.compareTo(str1) == 0)
                    System.out.println("Both strings are equals");

                else
                    System.out.println("Both string are NOT equals");

                break;
            }

        }

    }
}
