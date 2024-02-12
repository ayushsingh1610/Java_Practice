// Write a Java program to get the file size in bytes, KB, MB.
import java.io.*;
public class code08 {
    public static void main(String[] args)throws IOException {
        
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\b.txt");
        System.out.println("Size of file is = " + f.length());
    }
}
