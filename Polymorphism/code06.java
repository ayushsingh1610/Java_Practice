// Write a Java program to create a class Shape with methods getArea() and getPerimeter(). Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter() methods in each subclass to calculate and return the area and perimeter of the respective shapes.
class Shape{
    double getArea(){
        return 0;
    }
    double getPerimeter(){
        return 0;
    }
}
class Circle extends Shape
{
    int r = 7;

    double getArea(){
        return 3.14*r*r;
    }
    double getPerimeter(){
        return 2*3.14*r;
    }
}
class Rectangle extends Shape{
    int l = 4, b = 5;
    double getArea(){
        return l*b;
    }
    double getPerimeter(){
        return 2*(l+b);
    }
}
class Triangle extends Shape{
    int a=3,b=4,c=5;
    double getArea(){
        int s = (a+b+c)/2;
        double ar = s*(s-a) * (s-b) * (s-c);
        return Math.sqrt(ar);
    }
    double getPerimeter(){
        return a+b+c;
    }
}

public class code06 {
    public static void main(String args[]){
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();

        System.out.println("Area of circle = " + c.getArea());
        System.out.println("Perimeter of circle = " + c.getPerimeter());
        System.out.println("\nArea of Recatngle = " + r.getArea());
        System.out.println("Perimeter of Rectangle = " + r.getPerimeter());
        System.out.println("\nArea of Triangle = " + t.getArea());
        System.out.println("Perimeter of Triangle = " + t.getPerimeter());
    }
    
}
