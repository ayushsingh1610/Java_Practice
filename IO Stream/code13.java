// Write a Java program to store text file content line by line in an array.
import java.util.*;
import java.io.*;
public class code13
{
    public static void main(String args[])throws Exception
    {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        Scanner sc = new Scanner(f);
        String a[] = new String[(int)f.length()];
        int i=0;
        while(sc.hasNextLine())
        {
            String data = sc.nextLine();
            a[i] = data;
        }
        for (String data : a) {
            System.out.println(data);
        }
    }
}