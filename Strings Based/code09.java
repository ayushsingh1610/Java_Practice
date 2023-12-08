
// Java program to convert char to string and vice versa.
import java.util.*;

public class code09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.format("Enter 1 for String to char.....\nEnter 2 for char to String.....\n\n");
        int n = sc.nextInt();

        switch (n) {
            case 1: {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the string = ");
                String str = input.nextLine();
                int len = str.length();
                char ch[] = new char[len];
                for (int i = 0; i < len; i++) {
                    ch[i] = str.charAt(i);
                    System.out.print(ch[i] + " ");
                }
                break;
            }
            case 2: {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the character = ");
                char ch = input.next().charAt(0);
                String str = "";
                str = str + ch;
                System.out.println(str);
                break;
            }
        }
    }
}
