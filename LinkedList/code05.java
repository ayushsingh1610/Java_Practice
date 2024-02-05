// Write a Java program to get the first and last occurrence of the specified elements in a linked list.
import java.util.*;
class code05
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        Input(ll);

        System.out.print("Enter the element = ");
        int element = sc.nextInt();
        System.out.println("First occurance of element is = " + ll.indexOf(element));
        System.out.println("Last occurance of element is = " + ll.lastIndexOf(element));
        
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