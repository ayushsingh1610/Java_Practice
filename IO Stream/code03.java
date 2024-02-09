// Write a Java program to check if a file or directory specified by pathname exists or not.
import java.io.*;
class code03
{
    public static void main(String[] args) {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");

        if(f.isFile())
        {
            if(f.exists())
            System.out.println("File is Exists.");

            else
            System.out.println("File is NOT exists.");
        }
        
        if(f.isDirectory())
        {
            if(f.exists())
            System.out.println("Directory is Exists.");

            else
            System.out.println("Directory is NOT exists.");
        }
        
    }
}