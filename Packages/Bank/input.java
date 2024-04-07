package Bank;

import java.util.*;
public class input {

    public String name;
    public long acc_num;
    public double amount;

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name = ");
        name = sc.nextLine();

        System.out.print("Enter the Acc num = ");
        acc_num = sc.nextInt();

        System.out.print("Enter the initial amount = ");
        amount = sc.nextDouble();

        calculate ob = new calculate(amount);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(long acc_num) {
        this.acc_num = acc_num;
    }
    public void show()
    {
        System.out.println("Name = " + name);
        System.out.println("Account number = " + acc_num);
        System.out.println("Current Balance = " + amount);
    }
    
}
