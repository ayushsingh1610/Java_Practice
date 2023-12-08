// Write a Java program to create a base class Animal with methods move() and makeSound(). Create two subclasses Bird and Panthera. Override the move() method in each subclass to describe how each animal moves. Also, override the makeSound() method in each subclass to make a specific sound for each animal.
class Animal{
    void move(){
    }
    void makeSound()
    {
    }
}
class Bird extends Animal {
    void move(){
        System.out.println("Bird is flying");
    }
    void makeSound()
    {
        System.out.println("Chirp Chirp....");
    }
}
class Panthera extends Animal{
    void move(){
        System.out.println("Panthera is moving.");
    }
    void makeSound()
    {
        System.out.println("Panthera is ");
    }
}

public class code07 {
    public static void main(String[] args) {
        Bird b = new Bird();
        Panthera p = new Panthera();
        b.move();
        b.makeSound();

        p.move();
        p.makeSound();
    }   
}
