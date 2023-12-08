// Program to find 3rd largest in array
import java.util.*;
public class code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for(int i=0;i<10;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
       
        /*for(int i=0;i<10;i++)
        {
            System.out.print(a[i] + " ");
        } */
        System.out.println("The 3rd largest number is " + a[7]);
        sc.close();
    }
}
