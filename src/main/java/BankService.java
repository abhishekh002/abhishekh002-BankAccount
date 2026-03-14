public class BankService {

    private double balance;

    public BankService(){
        this.balance = 0;
    }

    // deposit money
    public void deposit(double amount){
        balance = balance + amount;
    }

    // withdraw money
    public void withdraw(double amount){
        if(balance - amount >= 0){
            balance = balance - amount;
        }
    }

    // return balance
    public double getBalance(){
        return balance;
    }
}