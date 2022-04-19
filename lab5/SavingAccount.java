package lab5;

public class SavingAccount extends BankAccount{
    private boolean isAvailable;
    public SavingAccount(double balance,
                         double interestRate){
        super(balance, interestRate);
    }

    public void deposit(double amount){
        super.deposit(amount);
        if(super.getBalance() > 25){
            isAvailable = true;
        }
    }

    public void withdraw(double amount) {
        if(super.getBalance() < 25){
            isAvailable = false;
        }else {
            super.withdraw(amount);
        }
    }

    public String toString(){
        return super.toString() + isAvailable;
    }
}
