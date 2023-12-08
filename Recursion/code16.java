// Write a Java recursive method to generate all possible permutations of a given string.
import java.util.*;
public class code16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String = ");
        String str = sc.nextLine();
        Permutations(str,0,str.length() -1);
        sc.close();
    }
    static void Permutations(String str, int i, int l)
    {
        if(i<=4)
        return ;

        else
        {
            if(l>=-1)
            {
                System.out.println(str.substring(i, l+1));
                Permutations(str, i, l-1);
            }
            else
            {
                Permutations(str, i+1, 4);
            }
        }
    }
}
