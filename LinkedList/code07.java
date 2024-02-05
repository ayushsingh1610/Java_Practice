// Write a Java program that swaps two elements in a linked list.
import java.util.*;
public class code07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        Input(ll);
        System.out.print("Enter the initial position = ");
        int i = sc.nextInt();
        System.out.print("Enter the final position = ");
        int j = sc.nextInt();
        
        int temp = ll.get(i);
        ll.set(i,ll.get(j));
        ll.set(j,temp);

        System.out.println(ll);
        
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
