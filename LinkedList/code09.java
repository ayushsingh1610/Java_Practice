// Write a Java program to convert a linked list to an array list.
import java.util.*;
public class code09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        Input(ll);
        for (int i = 0; i < ll.size(); i++) {
            ar.add(ll.get(i));
        }
        System.out.println(ar);
        
    }
    public static void Input(LinkedList<Integer> ll) {
        ll.add(2);
        ll.add(4);
        ll.add(6);
        ll.add(3);
        ll.add(9);
        ll.add(2);
    }
}
