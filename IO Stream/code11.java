// Write a Java program to read a plain text file.
import java.util.*;
import java.io.*;
public class code11
{
    public static void main(String args[])throws Exception
    {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        Scanner sc = new Scanner(f);

        while(sc.hasNextLine())
        {
            System.out.println(sc.next());
        }
    }
}