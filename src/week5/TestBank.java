package week5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestBank {
    public static boolean testAccounts(BankAccount b1,BankAccount b2){
        if (!b1.getAccountHolder().equals(b2.getAccountHolder())){
            return false;
        }
        if (! (b1.checkBalance()==b2.checkBalance())){
            return false;
        }
        return true;
    }
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

        for (BankAccount exp : expected){
            boolean found=false;
            for (BankAccount act : actual){
                if (testAccounts(exp,act)){
                    found=true;
                }
            }
            assertTrue(found);
        }
    }
}
