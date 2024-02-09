// Write a Java program to check if the given pathname is a directory or a file.
import java.io.File;
import java.util.*;
public class code01
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        File d = new File("C:\\Users\\good\\Documents\\Temporary");

        if(f.isFile())
        {
            System.out.println(f.getAbsolutePath() + " is a file");
        }
        if(d.isDirectory())
        {
            System.out.println(d.getAbsolutePath() + " is a Directory.");
        }

    }
}