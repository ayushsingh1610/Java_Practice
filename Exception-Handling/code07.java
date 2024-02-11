// Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
import java.util.*;
public class code07
{
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string = ");
        String str = sc.nextLine();
        ArrayList<Character> CharArray = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            CharArray.add(str.charAt(i));
        }
        if(!containVowel(CharArray))
        {
            throw new Exception("String does not contains vowels.");
            
        }
        else
        {
            System.out.println("Vowels are present.");
        }
    }
    public static boolean containVowel(ArrayList<Character> ch)
    {
        if (ch.contains('a') || ch.contains('e')|| ch.contains('i')|| ch.contains('u')|| ch.contains('o'))
        return true;

        return false;
    }

}