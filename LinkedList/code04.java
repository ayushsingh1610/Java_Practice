// Write a Java program to insert elements into the linked list at the first and last positions.
import java.util.*;
public class code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        Input(ll);
        System.out.print("Enter the element to insert at First Position = ");
        int first_pos = sc.nextInt();
        System.out.print("Enter the element to insert at Last Position = ");
        int last_pos = sc.nextInt();
        ll.addFirst(first_pos);
        ll.addLast(last_pos);

        System.out.println(ll);
    }
    public static void Input(LinkedList<Integer> ll) {
        ll.add(2);
        ll.add(4);
        ll.add(6);
        ll.add(3);
        ll.add(9);
        ll.add(1);
    }
}
