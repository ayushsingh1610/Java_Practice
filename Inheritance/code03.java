// Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

class Vehicle{
    void drive()
    {
        System.out.println();
    }
}
class Car extends Vehicle{
    void drive()
    {
        System.out.println("Repairing a car");
    }
}
public class code03 {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
    
}
