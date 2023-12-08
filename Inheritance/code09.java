// Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.
class Shape{
    double getPerimeter(){
        return 0;
    }
    double getArea(){
        return 0;
    }
}
class Circle extends Shape{
    int r = 7;

    double getArea()
    {
        return 3.14*r*r;
    }

    double getPerimeter(){
        return 2*3.14*r;
    }
}

public class code09 {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area of circle = " + c.getArea());
        System.out.println("Perimeter of circle = " + c.getPerimeter());
    }
    
}
