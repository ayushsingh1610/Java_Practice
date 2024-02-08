// Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.
import java.util.*;
public class code07
{
    public static void main(String args[])throws NewException
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string = ");
        String str = sc.nextLine();
        List<Character> CharArray = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            CharArray.add(str.charAt(i));
        }
        if(containVowel(CharArray))
        {
            throw new NewException("String contains vowels.");
        }
        else
        {
            System.out.println("Vowels are NOT present.");
        }

    }
    public static boolean containVowel(List<Character> str)
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