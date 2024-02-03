// Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.*;
class code01
{
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Yellow");
        a.add("Red");
        a.add("Blue");
        a.add("Green");
        a.add("Purple");
        // Input(a);
        Display(a);
    }
    public static void Input(ArrayList<String> a)
    {
        Scanner sc = new Scanner(System.in);
        int i=0;
        System.out.print("Enter the elements = ");
        while(i<a.size()){
            String temp = sc.next();
            a.add(temp);
            i++;
        }
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