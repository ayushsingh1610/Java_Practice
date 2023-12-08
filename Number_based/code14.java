/* Java Program to Fascinating Number*/
import java.util.*;
public class code14
{
    public static boolean isFascinating(int num)
    {
        String value = " " + num + (num*2) + (num*3);
        int freq=0;
        boolean flag = false;
        for(int i=1;i<=9;i++)
        {
            for(int j=0;j<=value.length();j++)
            {
                if((i+47)==(int)value.charAt(i))
                {
                    freq++;
                }
            }
            if(freq==1)
            {
                flag= true;
                freq=0;
            }
        }
        if(flag)
        return true;

        else
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        if(n>100)
        {
            if(isFascinating(n))
            System.out.println("Fascinating number.");
        }
        sc.close();
    }    
}
