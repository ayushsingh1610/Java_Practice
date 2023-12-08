// Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.
class Vehicle{
    int speed;
    void SpeedUp(){
        speed = 30;
        System.out.println(speed);
    }
}
class Car extends Vehicle{
    void SpeedUp(){
        speed =50;
        System.out.println(speed);
    }
}
class Bicycle extends Vehicle{
    void SpeedUp(){
        speed = 20;
        System.out.println(speed);
    }
}
public class code02 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Bicycle b = new Bicycle();

        v.SpeedUp();
        c.SpeedUp();
        b.SpeedUp();

    }   
}
