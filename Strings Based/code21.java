// Java Program to implement switch case on strings.
import java.util.*;
public class code21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the strings = ");
        String str = sc.nextLine();

        switch(str)
        {
            case "psvm":
            System.out.println("public static void main(Strings args[])");
            break;

            case "sysout" :
            System.out.println("System.out.println();");
            break;

            default :
            System.out.println("Invaild choice.");
        }
    }  
}
