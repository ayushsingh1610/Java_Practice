// Program to remove the duplicate elements in array
import java.util.*;
public class code9 {
    public static void main(String[] args) {
        int a[] = {1,2,2,1,4,5,6,7,5,3};
        int flag = 0;
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]==a[j])
                {
                    flag++;
                    continue;
                }
            }
            if(flag==0)
            {
                System.out.print(a[i] + " ");
            }
            flag=0;
        }
    }
}
