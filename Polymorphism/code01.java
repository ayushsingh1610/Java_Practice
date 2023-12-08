// Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.
class Animal{
    void Sound()
    {
        System.out.println("Making sound.");
    }
}
class Bird extends Animal{
    void Sound()
    {
        System.out.println("Chirp...");
    }
}
class Cat extends Animal
{
    void Sound(){
        System.out.println("Meow");
    }
}
class code01
{
    public static void main(String[] args) {
        Animal a = new Animal();
        Bird b = new Bird();
        Cat c = new Cat();
        a.Sound();
        b.Sound();
        c.Sound();
    }
}