// Java program to count vowels and consonants.
import java.util.*;
public class code05
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = " );
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vowels =0, consonants=0;
        
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    vowels++;
                }
                else if(!(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
                {
                    consonants++;
                }
            }
        }
        System.out.println("The number of vowels are = " + vowels);
        System.out.println("The number of consonants are =  " + consonants);
    }    
}
