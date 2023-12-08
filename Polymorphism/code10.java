// Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). Create two subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each subclass to start and stop the engines differently.
class Vehicle{

    int startEngine(){
        return 0;
    }
    int stopEngine(){
        return 0;
    }
}

class Car extends Vehicle{
    int startEngine(){
        return 40;
    }
    int stopEngine(){
        return 0;
    }
}
class Motorcycle extends Vehicle{
    int startEngine(){
        return 10;
    }
    int stopEngine(){
        return 0;
    }
}
class code10{
    public static void main(String[] args) {
        Car c = new Car();
        Motorcycle m = new Motorcycle();

        System.out.println("Speed of car after starting = " + c.startEngine());
        System.out.println("Speed of car after stoping Engine = " + c.stopEngine());

        System.out.println("Speed of Motocycle after starting = " + m.startEngine());
        System.out.println("Speed of Mototcycle after stoping = " + m.stopEngine());
    }
}