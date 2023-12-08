// Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.
class BankAccount{
    int balance = 100000;
    int deposit(int amt)
    {
        return 0;
    }
    int withdraw(int amt)
    {
        return 0;
    }
}

class SavingsAccount extends BankAccount{
    int deposit(int amt)
    {
        balance += amt;
        return balance;
    }
    int withdraw(int amt)
    {
        if(amt<=balance)
        balance-=amt;
        return balance;
    }
}
class CheckingAccount extends BankAccount{
    int deposit(int amt)
    {
        balance += amt;
        return balance;
    }
    int withdraw(int amt)
    {
        if(amt <= balance)
        balance-=amt;
        return balance;
    }
}

public class code09 {
    public static void main(String args[])
    {
        SavingsAccount sa = new SavingsAccount();
        CheckingAccount ca = new CheckingAccount();

        System.out.println(sa.deposit(345));
        System.out.println(sa.withdraw(983));

        System.out.println(ca.deposit(234));
        System.out.println(ca.withdraw(576));
    }
}
