// Write a Java program to compare two hash set.
import java.util.*;
class code01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> ob = new HashSet<>();
        HashSet<Integer> ob2 = new HashSet<>();
        Input(ob);
        Input(ob2);

    }
    public static void Input(HashSet<Integer> hs) {
        hs.add(2);
        hs.add(4);
        hs.add(6);
        hs.add(3);
        hs.add(9);
        hs.add(2);
    }
}