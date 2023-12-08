// Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
interface Account{
    public void deposit(int amt);
    public void withdraw(int amt);
    public void calculateinterest(int r, int t);
    public void viewBalance();
}
class SavingsAccount implements Account{
    int balance = 100000;

    public void deposit(int amt){
        balance+=amt;
        System.out.format("Amount is Deposited = %d\n",amt);
    }
    public void withdraw(int amt){
        balance-=amt;
        System.out.format("Amount is Withdrawn = %d\n",amt);
    }
    public void calculateinterest(int r, int t){
        int SI = (balance * r * t)/100;
        System.out.println("Interest on balance is = " + SI);
    }
    public void viewBalance(){
        System.out.println("Your Balance is = " + balance);
    }
}
class CurrentAccount implements Account{
    int balance = 100000;

    public void deposit(int amt){
        balance+=amt;
        System.out.format("Amount is Deposited = %d\n",amt);
    }
    public void withdraw(int amt){
        balance-=amt;
        System.out.format("Amount is Withdrawn = %d\n",amt);
    }
    public void calculateinterest(int r, int t){
        int SI = (balance * r * t)/100;
        System.out.println("Interest on balance is = " + SI);
    }
    public void viewBalance(){
        System.out.println("Your Balance is = " + balance);
    }
}

public class code04 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();

        sa.viewBalance();
        sa.deposit(2000);
        sa.calculateinterest(3, 1);
        sa.viewBalance();

        System.out.println();

        ca.viewBalance();
        ca.withdraw(3455);
        ca.calculateinterest(2, 1);
        ca.viewBalance();

    }
    
}
