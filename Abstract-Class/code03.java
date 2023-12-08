// Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
abstract class BankAccount{
    abstract void deposit(int amt);
    abstract void withdraw(int amt);
}
class SavingsAccount extends BankAccount{
    int balance = 100000;

    void deposit(int amt){
        balance+=amt;
    }

    void withdraw(int amt){
        balance-=amt;
    }
}

class CurrentAccount extends BankAccount{
    int balance = 100000;

    void deposit(int amt){
        balance+=amt;
    }
    void withdraw(int amt){
        balance-=amt;
    }
}

public class code03 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();

        s.deposit(234);
        s.withdraw(456);
        System.out.println("Last balance in Savings Account = " + s.balance);

        c.deposit(567);
        c.withdraw(739);
        System.out.println("Last balance in Curent Account = " + c.balance);

    }
}
