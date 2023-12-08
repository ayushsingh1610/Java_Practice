// Write a Java program to create a base class Sports with a method called play(). Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass to play a specific statement for each sport.
class Sports{
    void play(){
        System.out.println("Playing");
    }
}
class Football extends Sports{
    void play(){
        System.out.println("Playing Football");
    }
}
class Basketball extends Sports{
    void play(){
        System.out.println("Playing Baskteball");
    }
}
class Rugby extends Sports{
    void play(){
        System.out.println("Playing Rugby");
    }
}
public class code05 {
    public static void main(String[] args) {
        Football f = new Football();
        Basketball b = new Basketball();
        Rugby r = new Rugby();

        f.play();
        b.play();
        r.play();
    }   
}
