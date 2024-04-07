package Bank;

public class calculate {
    public double amount;

    public calculate(double amount) {
        this.amount = amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void deposit(double amt)
    {
        amount+= amt;
        System.out.println("Deposit Successfull....");
    }
    public void withdraw(double amt)
    {
        if(amt<amount)
        {
            amount-=amt;
            System.out.println("Withdrawal Successfull....");
        }
        else 
        {
            System.out.println("Insufficient balance");
        }
    }
    public double getAmount() {
        return amount;
    }
    
}
