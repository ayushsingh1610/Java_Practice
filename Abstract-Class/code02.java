// Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape
abstract class Shape{
    abstract void calculateArea();

    abstract void calculatePerimeter();

}
class Circle extends Shape{
    int r = 7;
    void calculateArea()
    {
        System.out.println("Area of Circle is = " + (3.14 * r * r));
    }
    void calculatePerimeter()
    {
        System.out.println("Perimeter of Circle is = " + (2 * 3.14 * r));
    }
}
class Triangle extends Shape{
    int b =6, h=8, hypo = 10;
    void calculateArea(){
        System.out.println("Area of Triangle is = " + (0.5 * b * h));
    }
    void calculatePerimeter(){
        System.out.println("Perimeter of Triangle is = " + (b + h + hypo));
    }
}
public class code02 {
    public static void main(String[] args) {
    Circle c = new Circle();
    Triangle t = new Triangle();

    c.calculateArea();
    c.calculatePerimeter();

    t.calculateArea();
    t.calculatePerimeter();
    }
}
