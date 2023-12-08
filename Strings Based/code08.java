// Java program to perform bubble sort on strings.
import java.util.*;
public class code08 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string = ");
        String str = sc.nextLine();
        str+= " ";
        String [] strarray = str.split(" ");
        for(int i=0;i<strarray.length -1;i++)
        {
            for(int j=i+1;j<strarray.length;j++)
            {
                if(strarray[i].compareTo(strarray[j])>0)
                {
                    String temp = strarray[i];
                    strarray[i] = strarray[j];
                    strarray[j] = temp ;
                }
            }
        }
        for(int i=0;i<strarray.length;i++)
        System.out.print(strarray[i] + " ");
    }    
}
