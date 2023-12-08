// Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.
abstract class Person{
    abstract void eat();
    abstract void exercise();
}
class Athlete extends Person{
    void eat(){
        System.out.println("Athlete is eating healthy food.");
    }
    void exercise(){
        System.out.println("Athlete is exercising daily");
    }
} 
class LazyPerson extends Person{
    void eat(){
        System.out.println("LazyPerson is eating junk food.");
    }
    void exercise(){
        System.out.println("LazyPerson is exercising randomly");
    }
} 

public class code07 {
    public static void main(String[] args) {
        Athlete a = new Athlete();
        LazyPerson l = new LazyPerson();
        a.eat();
        a.exercise();

        l.eat();
        l.exercise();
    }
}
