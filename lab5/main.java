package lab5;

public class main {
    public static void main(String[] args){
        SavingAccount account = new SavingAccount(1500.0, 0.13);
        account.deposit(350);
        account.withdraw(800);
        System.out.println(account.getBalance());
    }
}
