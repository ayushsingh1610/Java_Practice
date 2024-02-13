// Write a Java program to write and read a plain text file.
import java.io.*;
import java.util.*;
class code14
{
    public static void main(String[] args)throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 for read data \nPress 2 for Write data :");
        int n = sc.nextInt();

        switch(n)
        {
            case 1:
            {
                ReadData();
                break;
            }
            case 2:
            {
                WriteData();
                break;
            }
            default:
            System.out.println("Invalid choice!");
        }
        sc.close();
    }
    public static void WriteData()throws Exception
    {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        Scanner sc = new Scanner(System.in);
        FileWriter writedata = new FileWriter(f);
        System.out.print("Enter the data to enter = ");
        String data = sc.nextLine();

        writedata.write(data);
        writedata.close();
        sc.close();
    }
    public static void ReadData()throws Exception
    {
        File f = new File("C:\\Users\\good\\Documents\\Temporary\\a.txt");
        FileReader readdata = new FileReader(f);
        int i;    
          while((i=readdata.read())!=-1)    
          System.out.print((char)i); 

        readdata.close();
    }
}