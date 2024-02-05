// Write a Java program to append the specified element to the end of a linked list.
import java.util.*;
class code01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();
        Input(ll);
        System.out.print("Enter the element = ");
        int element = sc.nextInt();

        ll.addLast(element);

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