// Java Program to find longest repeating sequence in a string.
import java.util.*;
public class code17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String str = sc.nextLine();
        String temp =" ", maxString = " ";
        int max =0;

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            for(int j=i+1;j<str.length();j++)
            {
                if(ch== str.charAt(j) || ch == str.charAt(j-1))
                {
                    temp+=ch;
                }
            }
            if(temp.length()>max)
            {
                max = temp.length();
                maxString = temp;
            }
            temp = "";
        }
        System.out.println(maxString);

    }  
}
