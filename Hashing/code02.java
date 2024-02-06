// Write a Java program to associate the specified value with the specified key in a HashMap.
import java.util.*;
public class code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> ob = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name = ");
            ob.put(i, sc.nextLine());
        }

        for(int i=0; i<5;i++)
        {
            System.out.println(i + " = " + ob.get(i));
        }
    }
}
