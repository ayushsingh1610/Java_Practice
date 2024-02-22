// Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.
import java.util.*;
class BankAccount
{
    private int accountNumber;
    private double balance;

    public int getAccountnumber()   {return accountNumber;}
    public void setAccountnumber(int accountNumber)  {this.accountNumber = accountNumber;}

    public double getBalance()      {return balance;}
    public void setBalance(double balance)      {this.balance = balance;}
}
public class code02
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BankAccount ob = new BankAccount();
        System.out.print("Enter the account number = ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter the balance = ");
        double balance = sc.nextInt();

        ob.setAccountnumber(accountNumber);
        ob.setBalance(balance);

        System.out.println("\nPress 1 for account number.\nPress 2 for Balance enquiry.\n");
        System.out.print("Enter your choice = ");
        int n = sc.nextInt();

        switch(n)
        {
            case 1:
            System.out.println("Account Number = " + ob.getAccountnumber());
            break;

            case 2:
            System.out.println("Balance left = " + ob.getBalance());
            break;

            default:
            System.out.println("Invalid choice.");
        }


    }
}