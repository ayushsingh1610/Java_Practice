// Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.*;
class code01
{
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        
        Input(a);
        Display(a);
    }
    public static void Input(ArrayList<String> a)
    {
        a.add("Yellow");
        a.add("Red");
        a.add("Blue");
        a.add("Green");
        a.add("Purple");
    }
    public static void Display(ArrayList<String> a)
    {
        Iterator it = a.iterator(); 
            while(it.hasNext())
            {
                System.out.print(it.next() + " ");
            }
    }
}