// Write a Java recursive method to find the length of a given string.
import java.util.*;
public class code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String str = sc.nextLine()+".";
        System.out.println("Length of given string is = " + length(str,0,1));
        sc.close();
    }
    static int length(String str,int i,int l)
    {
        if(str.charAt(i)=='.')
        return 0;

        else
        return l + length(str,i+1,l);
        
    }
}
