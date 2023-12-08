// Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.
class Shape{
    void draw()
    {

    }
    void calculatearea(){

    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Draw a Circle");
    }
    void calculatearea(){
        int r =7;
        System.out.println("Area = " + (3.14 * r * r));
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("\nDraw a Square ");
    }
    void calculatearea(){
        int a =6;
        System.out.println("Area = " + (a*a));
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("\nDraw a Triangle");
    }
    void calculateare()
    {
        int b=5,h=10;
        System.out.println("Area = " + (b*h)/2);
    }
}

public class code08 {
    public static void main(String args[])
    {
        Circle c = new Circle();
        Square s = new Square();
        Triangle t = new Triangle();

        c.draw();
        c.calculatearea();

        s.draw();
        s.calculatearea();

        t.draw();
        t.calculateare();
    }
}
