// Write a Java program to get a list of all file/directory names in the given directory.
import java.io.*;
public class code05 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\good\\Documents\\Temporary");

        if(f.isDirectory())
        {
            String str[] = f.list();
            System.out.println("List of Files are = ");
            for (int i=0; i<str.length;i++) {
                System.out.println(i+1 + ". " + str[i]);
            }
        }
        else
        System.out.println(f.getAbsolutePath() + " is not a Directory.");
    }
}
