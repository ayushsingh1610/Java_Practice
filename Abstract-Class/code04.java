// Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.
abstract class Animal{
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal{
    void eat(){
        System.out.println("Lion is eating ");
    }
    void sleep(){
        System.out.println("Lion is sleeping");
    }
}

class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger is eating");
    }
    void sleep(){
        System.out.println("Tiger is sleeping");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Deer is eating");
    }
    void sleep(){
        System.out.println("Deer is sleeping");
    }
}

public class code04 {
    public static void main(String[] args) {
        Lion l = new Lion();
        Tiger t = new Tiger();
        Deer d = new Deer();

        l.eat();
        l.sleep();

        t.eat();
        t.sleep();

        d.eat();
        d.sleep();

    }
    
    
}
