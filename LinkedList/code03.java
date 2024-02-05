// Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.*;
public class code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.print("Enter the specified position = ");
        int pos = sc.nextInt();
        Input(ll);
        for (int i = pos; i < ll.size(); i++) {
            System.out.print(ll.get(i)+ " ");
        }
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
