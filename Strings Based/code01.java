// Java program to find Duplicate character in String.
import java.util.*;
class code01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String = ");
        String str = sc.nextLine();
        int occurance=0;

        for(int i=0 ; i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    occurance++;
                }
            }
            if(occurance>=1)
            {
                System.out.println(str.charAt(i));
            }
            occurance=0;
        }
    }
}