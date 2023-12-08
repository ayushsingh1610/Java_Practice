// Program to find number of elements in an array.
import java.util.*;
public class code01 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,5,4,3,2,1};
        Scanner sc = new Scanner (System.in);
        int counter =0;
        for(int i=0;i<11;i++)
        {
            for(int j=1;j<11;j++)
            {
                if(a[i]==a[j])
                {
                    counter++;
                }
            }
            System.out.format("The frequency of %d  in array is %d\n",a[i],counter);
            counter =0;
        }
    }   
}

