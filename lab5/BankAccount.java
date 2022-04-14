package lab5;

import java.lang.invoke.LambdaMetafactory;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private int numOfDeposit;
    private int numOfWithdraw;
    private double interestRate;

    public BankAccount(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount){
        this.balance += amount;
        numOfDeposit++;
    }

    public void withdraw(double amount){
        this.balance -= amount;
        numOfWithdraw--;
    }

    public double getBalance(){
        return balance;
    }
}
