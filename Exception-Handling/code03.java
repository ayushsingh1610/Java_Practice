// Write a Java program to create a method that reads a file and throws an exception if the file is not found.
import java.io.*;
import java.util.*;
public class code03 {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner sc = new Scanner (System.in);
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
            if(f.canRead())
            {
                System.out.print("File is Readable.");
            }
            else
            {
                throw new FileNotFoundException("File NOt Found");
            }
        
    }
}
