// Write a Java program to retrieve an element (at a specified index) fom a given array list.
import java.util.*;
public class code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ob = new ArrayList<>();
        System.out.print("Enter the index = ");
        int pos = sc.nextInt();
        Input(ob);
        System.out.println("Element at index " + (pos-1) + " = " + ob.get(pos));
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
                System.out.print(it.next() + "  ");
            }
    }
}