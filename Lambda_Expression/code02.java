// Write a Java program to implement a lambda expression to check if a given string is empty.
import java.util.*;

interface One
{
    void isEmpty(String message);
}
class code02
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.nextLine();

        One obj = (message) -> {
            if(str.isEmpty())   System.out.print("String is Empty");
            else if(str.compareTo(" ")==0)      System.out.print("String has Whitespace.");
            else    System.out.print("String has some other character.");
        };
        obj.isEmpty(str);
    }
}