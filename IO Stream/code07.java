// Write a Java program to read input from the Java console.
import java.io.*;
public class code07 {
    public static void main(String[] args)throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the string = ");
        String str = b.readLine();

        System.out.println("Inputted data = " + str);
    }
}
