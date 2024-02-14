// Write a Java program to append text to an existing file.
import java.util.*;
import java.io.*;
public class code15
{
    public static void main(String args[])throws Exception
    {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        Scanner sc = new Scanner(System.in);
        Writer writedata = new FileWriter(f,true);

        System.out.print("Enter the data to append = ");
        String data = sc.nextLine();

        writedata.append(data);

        writedata.close();
    }
}