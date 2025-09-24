package week5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestBank {
    @Test
    public void testBank(){
        Bank bank=new Bank();
        bank.addAccount(new BankAccount("a",1));
        bank.addAccount(new BankAccount("b",2));
        bank.addAccount(new BankAccount("c",3));
        bank.addAccount(new BankAccount("d",4));
        bank.addAccount(new BankAccount("e",5));
        ArrayList<BankAccount> actual=bank.getAccounts();

        ArrayList<BankAccount> expected=new ArrayList<>(
                Arrays.asList(
                        new BankAccount("e",5),
                        new BankAccount("c",3),
                        new BankAccount("a",1),
                        new BankAccount("b",2),
                        new BankAccount("d",4)
        ));
    }
}
