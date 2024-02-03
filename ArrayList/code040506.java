// Write a Java program to update an array element by the given element.
// Write a Java program to remove the third element from an array list.
// Write a Java program to search for an element in an array list.
import java.util.*;
public class code040506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ob = new ArrayList<>();
        Input(ob);

        System.out.print("Enter your choice = ");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            {
                Scanner s = new Scanner(System.in);

                System.out.print("Enter the new element= ");
                String element = s.nextLine();

                System.out.print("Enter the position = ");
                int n = s.nextInt();

                ob.set(n-1, element);
                Display(ob);
                break;
            }
            case 2:
            {
                ob.remove(2);
                Display(ob);
                break;
            }

            case 3:
            {
                Scanner s = new Scanner(System.in);
                System.out.print("Enter the element to find = ");
                String str = s.nextLine();

                if(ob.contains(str))    System.out.println("Element present");
                else    System.out.println("Element Not Present");

                Display(ob);

                break;
            }
        }
        
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
