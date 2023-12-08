// nth term of Fibonacci Series
import java.util.*;
public class code12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth number = ");
        int n = sc.nextInt();

        System.out.format("The %dth term of fibonacci series is = %d",n, Fibo(n));
        sc.close();
    }
    static int Fibo(int n)
    {
        if(n==1 )
        return 0;
        
        if(n==2)
        return 1;

        else
        return Fibo(n-1) + Fibo(n-2);
    }
}
