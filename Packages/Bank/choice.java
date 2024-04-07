package Bank;
import java.util.*;
public class choice {
    public void run() {
        Scanner sc = new Scanner(System.in);
        input ob = new input();
        calculate calc = new calculate(ob.amount);
        System.out.println("\nEnter  1 for deposit\nEnter 2 For Withdraw\n");
        int n = sc.nextInt();

        switch (n) {
            case 1:
            {
                System.out.print("Enter the amount = ");
                double amt = sc.nextDouble();
                calc.deposit(amt);
                System.out.println("\nCurrent Balance = " + calc.getAmount());
                break;
            }
            case 2:
            {
                System.out.print("Enter the amount = ");
                double amt = sc.nextDouble();
                calc.withdraw(amt);
                System.out.println("\nCurrent Balance = " + calc.getAmount());
                break;
            }
            default:
                System.out.println("Invlid choice");
                break;
        }
    }
}
