// Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
import java.util.*;
class Circle 
{
    private int radius;

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double calculateArea()
    {
        return 3.14*radius*radius;
    }
    public double calculatePerimeter()
    {
        return 2*3.14*radius;
    }
}
public class code05
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Circle ob = new Circle();
        System.out.print("Enter the radius = ");
        int r = sc.nextInt();

        ob.setRadius(r);

        System.out.println("The perimeter of Circle is = " + ob.calculatePerimeter());
        System.out.println("The area of circle is = " + ob.calculateArea());
    } 
}