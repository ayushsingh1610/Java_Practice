// Write a Java program to determine the last modified date of a file.
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class code06 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        long time = f.lastModified();
        DateFormat fDateFormat = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
        System.out.println("Last Format date is = " + fDateFormat.format(time));
    }
}
