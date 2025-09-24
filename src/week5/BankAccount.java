package week5;

public class BankAccount {
    private String accountHolder;
    private double money;

    public BankAccount(String ah,double m){
        this.accountHolder=ah;
        this.money=m;
    }
    public String getAccountHolder(){
        return this.accountHolder;
    }
    public double checkBalance(){
        return this.money;
    }
    public void deposit(double money){
        this.money+=money;
    }
    public void withdraw(double amount){
        this.money-=amount;
    }
    public boolean overdrawn(){
        return this.money<0;
    }
    public void transfer(BankAccount ah2,double amount){
        this.withdraw(amount);
        ah2.deposit(amount);
    }
}
