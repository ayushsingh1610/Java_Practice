// Write a Java program to read file content line by line.
import java.util.*;
import java.io.*;
public class code10
{
    public static void main(String args[])throws Exception
    {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        Scanner sc = new Scanner(f);
        
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
