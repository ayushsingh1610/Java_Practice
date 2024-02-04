import java.lang.reflect.Array;
import java.util.*;
public class code07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> ob = new ArrayList<>();

        System.out.print("Enter your choice = ");
        int ch = s.nextInt();
        Implementation(ob, ch);

    }
    public static void Implementation(ArrayList<String> ob,int ch)
    {
        switch(ch)
        {
            // Sort a giver array
            case 1:
            {
                Input(ob);
                Collections.sort(ob);
                Display(ob);
                break;
            }
            
            //Copy into other list
            case 2:
            {
                ArrayList<String> string = new ArrayList<>(ob);
                Display(string);
                break;
            }

            //Reverse elements
            case 3:
            {
                ArrayList<String> string = new ArrayList<>(ob);
                for(int i = ob.size()-1; i>=0 ;i--)
                string.add(ob.get(i));

                Display(string);

                break;
            }

            //Extract a portion of array
            case 4:
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the starting point = ");
                int start = sc.nextInt();

                System.out.print("Enter the ending point = ");
                int end = sc.nextInt();

                List<String> new_list = ob.subList(start, end);
                Display(new_list);
                break;
            }

            //swaps two elements
            case 5:
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the old position = ");
                int old_pos = sc.nextInt();
                System.out.print("Enter the new position = ");
                int new_pos = sc.nextInt();

                swap(ob,old_pos,new_pos);

                Display(ob);

                break;
            }

            //join two array list
            case 6:
            {
                Scanner sc = new Scanner(System.in);
                Input(ob);
                ArrayList<String> aList = new ArrayList<>();
                aList.addAll(ob);
                aList.add("Violet");
                aList.add("Black");
                aList.add("Brown");
                aList.add("Metallic grey");
                aList.add("Silver");

                System.out.println(aList);
                break;
            }

            //clone an arralist to another array list
            case 7:
            {
                Input(ob);
                ArrayList<String> aList =new ArrayList<>();
                aList.addAll(ob);
            }

            //empty an arraylist
            case 8:
            {
                Input(ob);
                ob.removeAll(ob);
                Display(ob);
            }

            // Test whether is empty or not
            case 9:
            {
                Input(ob);
                // ob.removeAll(ob);
                if(ob.isEmpty())
                System.out.println("ArrayList is Empty ");

                else
                System.out.println("ArrayList is Not Empty");
            }

            // Trimming the capacity
            case 10:
            {
                Input(ob);
                ArrayList<String> ob2 = new ArrayList<>(10);
                ob2.addAll(ob);
                ob2.trimToSize();

                System.out.println("Size after trimming = " + ob2.size());
            }

            //Replace the 2nd element with specified element
            case 11:
            {
                Input(ob);
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Element to add on 2nd position = ");
                String element = sc.nextLine();

                ob.set(2,element);

                Display(ob);
            }

            // Print all element with position
            case 12:
            {
                Input(ob);
                for (int i = 0; i < ob.size(); i++) {
                    System.out.printf("At position %d = %s\n", i+1,ob.get(i));
                }
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
    public static void Display(List<String> a)
    {
        Iterator it = a.iterator(); 
            while(it.hasNext())
            {
                System.out.print(it.next() + "  ");
            }
    }
    public static void swap(List<String> ob,int i,int j)
    {
        String temp = ob.get(i);
        ob.set(i,ob.get(j));
        ob.set(j,temp); 
    }
}
