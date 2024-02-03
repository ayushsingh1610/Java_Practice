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

            //
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
