package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return this.number;
    }

    
    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public void whithdraw(double amount){
        balance -= amount + 5.0;
    }

    @Override
    public String toString() {
        return "Account "
        + number
        + ", Holder: "
        + holder
        + ", Balance: $ "
        +  String.format("%.2f",balance);          
    }

}
