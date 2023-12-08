// Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.
class Shape{
    void calculatearea(){

    }
}
class Circle extends Shape{
    int r = 7 ;
    void calculatearea()
    {
        System.out.println("Area = " + ( 3.14 * r * r));
    }
}

class Rectangle extends Shape{
    int l = 2, b=5;
    void calculatearea()
    {
        System.out.println("Area = " + (l*b));
    }
}

class Triangle extends Shape{
    int a =3 , b=4, c=5;

    void calculatearea()
    {
        int s = (a+b+c)/2;
        int ar = s * ( s-a) * (s-b) * (s-c);
        System.out.println("Area is = " + Math.sqrt(ar));
    }
}
public class code03 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        c.calculatearea();
        r.calculatearea();
        t.calculatearea();
    }
    
}
