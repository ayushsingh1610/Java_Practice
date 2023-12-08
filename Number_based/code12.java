
/*Java Program to Autobiographical Number */
import java.util.*;

public class code12 {
    public static int counter(int n) {
        int d = 0;
        while (n > 0) {
            d++;
            n /= 10;
        }
        return d;
    }

    public static int[] toArray(int n) {
        int a[] = new int[counter(n)];
        int i = 0;
        while (n > 0) {
            a[i++] = n % 10;
            n /= 10;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int freq=0;
        int newnumber=0;
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        // Converts number into array 
        int a[] = toArray(n);

        for(int i=0;i<counter(n);i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(i==a[j])
                freq++;
            }
            newnumber = (newnumber*10)+freq;
            freq=0;
        }
        if(n == newnumber)
        System.out.println(n + " is a Autobiographical number");

        else
        System.out.println(n + " is NOT a Autobiographical number");

        sc.close();
    }    
}
