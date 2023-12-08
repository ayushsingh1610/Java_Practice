// Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape {
    void getArea(int l, int b){

    }
}
class rectangle extends Shape{
    void getArea(int l, int b){
        System.out.println("Area of recatngle is = " + (l*b));
    }
}
public class code04 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.getArea(5, 6);
    }
}
