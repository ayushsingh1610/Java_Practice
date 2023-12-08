// Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods.
interface Resizable{
    public void resizewidth(int width);
    public void resizeHeight(int height);
}
class Rectangle implements Resizable{
    int width =0, height =0;
    public void resizewidth(int width){
        this.width = width;
    }
    public void resizeHeight(int height){
        this.height = height;
    }

    public void volume(){
        System.out.println(width*height);
    }
}

public class code05 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.resizewidth(5);
        r.resizeHeight(8);
        r.volume();
    }
}
