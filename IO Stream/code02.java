// Write a Java program to check if a file or directory has read and write permissions.

import java.io.*;
public class code02 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        if(f.canRead())
        System.out.println("File is Readable.");

        else
        System.out.println("File is Not readable");

        if(f.canWrite())
        System.out.println("File is Writeable");

        else
        System.out.println("File is not Writeable");
    }
}
