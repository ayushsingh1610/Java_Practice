import java.util.*;
public class code2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the number of times you want to rotate = ");
        int n = sc.nextInt();

        for(int m=1;m<=n;m++)
        {
            int temp=a[0];
            for(int i=0;i<a.length-1;i++)
            {
                a[i] = a[i+1];
            }
            a[a.length-1]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
