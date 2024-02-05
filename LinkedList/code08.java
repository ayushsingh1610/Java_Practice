// Write a Java program to join two linked lists.
import java.util.*;
public class code08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();
        Input(ll);
        Input(ll2);

        ll2.addAll(ll);
        System.out.println(ll2);
        
        
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
