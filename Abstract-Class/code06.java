// Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.
abstract class shape{
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}
class Sphere extends shape{
    int r = 7;

    double calculateVolume(){
        return (3.14*3*r*r*r)/4;
    }
    double calculateSurfaceArea(){
        return 4*3.14*r*r;
    }
}
class Cube extends shape{
    int a = 7;

    double calculateVolume(){
        return a*a*a;
    }
    double calculateSurfaceArea(){
        return 6*a*a;
    }
}

public class code06 {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        Cube c = new Cube();

        System.out.println("The volume of sphere is = " + s.calculateVolume());
        System.out.println("The Surafce area of sphere is = " + s.calculateSurfaceArea());
        System.out.println("\nThe Volume of Cube is = "+ c.calculateVolume());
        System.out.println("The surface area of cube is = " + c.calculateSurfaceArea());
    }
}
