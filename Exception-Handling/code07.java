// Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
import java.util.*;
public class code07
{
    public static void main(String args[])throws NewException
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
            throw new NewException("String does not contains vowels.");
        }
        else
        {
            System.out.println("Vowels are present.");
        }

    }
    public static boolean containVowel(ArrayList<Character> str)
    {
        if(str.contains('a') || str.contains('e')|| str.contains('i')|| str.contains('u')|| str.contains('o'))
        return true;

        return false;
    }

}
class NewException extends Exception
{
    public NewException(String str)
    {
        super(str);
    }
}