import java.util.*;
public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [10];
        int largest =0;
        for(int i=0;i<10;i++)
        {
            System.out.format("Enter element at position %d = " ,(i+1));
            a[i] = sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            if(a[i]>largest)
            largest=a[i];
        }
        System.out.println("The largest element in array is = " + largest);

    }
}
