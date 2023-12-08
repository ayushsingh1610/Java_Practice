// Java Program to find maximun and minimum occuring character in a string.
import java.util.*;

public class code13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String str = sc.nextLine();

        int freq =0, minimum =10, maximun =0;
        char maxchar = ' ';
        char minchar = ' ';

        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    freq++;
                }
            }
            if(freq>maximun)
            {
                maximun = freq;
                maxchar = str.charAt(i);
            }
            else if(freq<minimum)
            {
                minimum = freq;
                minchar = str.charAt(i);
            }
            freq =0;
        }
        System.out.format("%s is occured maximum times by %d", maxchar,maximun);
        System.out.format("\n%s is occured minimum times by %d", minchar,minimum);
    }
}
