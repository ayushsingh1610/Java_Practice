// Write a Java program to find the longest word in a text file.
import java.io.*;
import java.util.*;
class code17
{
    public static void main(String[] args)throws Exception {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        Scanner sc = new Scanner(f);
        String largestword = "";
        while(sc.hasNext())
        {
            String data = sc.next();
            if(largestword.length() < data.length())    largestword = data;
        }
        System.out.println("Largets word = " + largestword);
    }
}