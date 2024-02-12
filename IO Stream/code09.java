// Write a Java program to read the contents of a file into a byte array.
import java.io.*;
import java.util.*;
public class code09 {
    public static void main(String[] args)throws Exception
    {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        Scanner sc = new Scanner(f);

        while(sc.hasNextByte())
        {
            System.out.println(sc.next());
        }
    }
}
