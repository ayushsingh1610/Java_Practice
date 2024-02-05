// Write a Java program to remove the first and last elements from a linked list.
import java.util.*;
public class code06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        Input(ll);
        System.out.println("List before removal = " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("List after removal = " + ll);
        
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
