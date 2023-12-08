// Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.
abstract class GeometricShape{
    abstract int area();
    abstract int perimeter();
}

class triangle extends GeometricShape{
    int a =6, b=8, c =10;

    int area(){
        return (b*a)/2;
    }
    int perimeter (){
        return a+b+c;
    }
}
class Square extends GeometricShape{
    int a = 5;

    int area(){
        return a*a;
    }
    int perimeter (){
        return 4*a;
    }
}
public class code08 {
    public static void main(String[] args) {
        triangle t = new triangle();
        Square s = new Square();

        System.out.println("The area of triangle is = " + t.area());
        System.out.println("The perimeter of triangle is = " + t.perimeter());
        System.out.println("\nThe area of square is = " + s.area());
        System.out.println("The Perimeetr of Square is = " + s.perimeter());
    }
}
