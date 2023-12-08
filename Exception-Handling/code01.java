// Write a Java program that throws an exception and catch it using a try-catch block.
import java.util.*;
public class code01 {
    public static void main(String[] args) {

        try {
        int result = 50 /0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero");
        }

        System.out.println("Rest of the code");
    }
}
