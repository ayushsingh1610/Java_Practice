// Write a Java program to read the first 3 lines of a file.
import java.util.*;
import java.io.*;
public class code16
{
    public static void main(String args[])throws Exception
    {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        Scanner sc = new Scanner(f);
        int i=0;
        try {while(i<=3)
        {
            System.out.println(i+1 + "- " + sc.nextLine());
            i++;
        }
    }catch (Exception e)
    {
        System.out.println("NO line found");
    }
    }
}