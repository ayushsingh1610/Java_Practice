// Fibonacci Series
import java.util.*;
public class code11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number = ");
        int n = sc.nextInt();
        System.out.print(0 + " " + 1 + " ");
        Fibo(0,1,n);
        sc.close();
    }
    static void Fibo(int a, int b, int n)
    {
        
        if(a+b <= n)
        {
            System.out.print(a+b + " ");
            Fibo(b,a+b,n);
        }
        
    }
}
