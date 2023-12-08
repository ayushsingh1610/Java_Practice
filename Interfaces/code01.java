// Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.

interface shape{
    public void getArea();
} 

class Rectangle implements shape{
    public void getArea(){
        System.out.println("Area of rectangle is = " + (4*5));
    }
}

class Circle implements shape{
    public void getArea()
    {
        System.out.println("Area of Circle is = " + (3.14 * 7 * 7));
    }
}
class Triangle implements shape{
    public void getArea(){
        System.out.println("Area of triangle is = " + (0.5 * 6 * 8));
    }
}

public class code01 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        Triangle t = new Triangle();

        r.getArea();
        c.getArea();
        t.getArea();
    }
}
