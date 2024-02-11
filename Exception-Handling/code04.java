// Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.
import java.util.*;
import java.io.*;
public class code04
{
    public static void main(String args[])throws Exception
    { 
            File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine())
            {
                int number = sc.nextInt();
                // System.out.println(number);

                if(number > 0)  
                {
                    throw new Exception("Number is Positive");
                }
                else
                System.out.println("Number is NOT Positive");
            }

    }
}