// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
class BankAccount{
    int balance = 10000;
    void deposit(){

    }
    void withdraw(){

    }
}
class SavingsAccount extends BankAccount{
    void deposit(int amt)
    {
        balance+=amt;
    }
    void withdraw(int amt )
    {
        if(amt<balance){
            balance-=amt;
        }
    }
}

public class code06 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        System.out.println("Balance before depositing = " + sa.balance);
        sa.deposit(123);
        System.out.println("Balance after depositing = " + sa.balance);
        sa.withdraw(123);
        System.out.println("Balance after withdrawing = " + sa.balance);
    }
}
