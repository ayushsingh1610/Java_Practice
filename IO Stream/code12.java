// Write a Java program to read a file line by line and store it in a variable.
import java.io.*;
import java.util.*;
class code12
{
    public static void main(String[] args)throws Exception 
    {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        Scanner sc = new Scanner(f);
        String data = new String();
        while(sc.hasNext())
        {
            data+= sc.next();
        }
        System.out.println("Data = " + data);
    }
}