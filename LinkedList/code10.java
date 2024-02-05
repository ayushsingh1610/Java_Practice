// Write a Java program to compare two linked lists.
import java.util.*;
public class code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        Input(ll);
        Input2(ll2);

        if(isSame(ll,ll2))
        System.out.println("LinkedList is same.");

        else
        System.out.println("LinkedList is not same.");
        
        
    }
    public static boolean isSame(LinkedList<Integer> ll,LinkedList<Integer> ll2)
    {
        for (int i = 0; i < ll.size() && i<ll2.size(); i++) {
            if(ll.get(i)!=ll2.get(i))
            return false;
        }
        return true;
    }
    public static void Input(LinkedList<Integer> ll) {
        ll.add(2);
        ll.add(4);
        ll.add(6);
        ll.add(3);
        ll.add(9);
        ll.add(2);
    }
    public static void Input2(LinkedList<Integer> ll2) {
        ll2.add(2);
        ll2.add(2);
        ll2.add(6);
        ll2.add(3);
        ll2.add(9);
        ll2.add(2);
    }
}
