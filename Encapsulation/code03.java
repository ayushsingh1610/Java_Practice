// Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.
import java.util.*;

class Rectangle 
{
    private int length,width;

    public int getLength()      {return length;}
    public void setLength(int length)     {this.length = length;}
    public int getWidth()       {return width;}
    public void setWidth(int width)     {this.width = width;}
}
public class code03
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Rectangle ob = new Rectangle();
        System.out.print("Enter the length = ");
        int length = sc.nextInt();
        System.out.print("Enter the width = ");
        int width = sc.nextInt();

        ob.setLength(length);
        ob.setWidth(width);

        System.out.println("\nPress 1 for Length.\nPress 2 for width.\n");
        System.out.print("Enter your choice = ");
        int n = sc.nextInt();

        switch(n)
        {
            case 1:
            System.out.println("Length = " + ob.getLength());
            break;

            case 2:
            System.out.println("Width = " + ob.getWidth());
            break;

            default:
            System.out.println("Invalid choice.");
        }

    }
}