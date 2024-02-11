// Write a Java program that reads a file and throws an exception if the file is empty.
import java.util.*;
import java.io.*;
public class code05
{
    public static void main(String args[])throws Exception
    {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\b.txt");
        Scanner sc = new Scanner(f);

        if(!sc.hasNext())
        {
            throw new Exception("File is Empty");
        }
        else
        {
            System.out.println("File is NOt empty");
        }
    }
}