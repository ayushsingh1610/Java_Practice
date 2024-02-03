// Write a Java program to insert an element into the array list at the first position.
import java.util.*;
public class code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ob = new ArrayList<>();
        Input(ob);
        System.out.print("Enter the element to add = ");
        String element = sc.nextLine();

        System.out.print("Enter the position = ");
        int pos = sc.nextInt();

        ob.add(pos,element);
        Display(ob);
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
