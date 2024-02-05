// Write a Java program to iterate through all elements in a linked list.
import java.util.LinkedList;
import java.util.Scanner;

public class code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();
        Input(ll);
        System.out.print("Enter the element = ");
        int element = sc.nextInt();

        ll.addLast(element);
        Display(ll);
        // System.out.println(ll);
        
    }
    public static void Input(LinkedList<Integer> ll) {
        ll.add(2);
        ll.add(4);
        ll.add(6);
        ll.add(3);
        ll.add(9);
        ll.add(1);
    }
    public static void Display(LinkedList<Integer> ll){
        for (int i = 0; i < ll.size(); i++) {
            System.out.printf("At position %d = %d\n", i, ll.get(i));
    }
}
}
