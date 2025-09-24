package week5;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts=new ArrayList<>();

    public void addAccount(BankAccount account){
        this.accounts.add(account);
    }
    public ArrayList<BankAccount> getLargeAccount(double threshold){
        ArrayList<BankAccount> out=new ArrayList<>();
        for (BankAccount current : this.accounts){
            if (current.checkBalance()>threshold){
                out.add(current);
            }
        }
        return out;
    }
    public ArrayList<BankAccount> getAccounts(){
        return this.accounts;
    }

    public static void main(String[] args) {
        BankAccount b=new BankAccount("Jesse",10);
        Bank bank=new Bank();
        bank.addAccount(b);
    }
}
