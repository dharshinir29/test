import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BankAccountTest {
    @Test
    @DisplayName("Withdraw 500 successfully")
    public void testWithdraw()
    {
        BankAccount bankAccount=new BankAccount(1000,0);
        bankAccount.withdraw(500);
        assertEquals(500,bankAccount.getBalance());
    }
    @Test
    public void testDeposit(){
        BankAccount bankAccount=new BankAccount(400,0);
        bankAccount.deposit(500);
        assertEquals(900,bankAccount.getBalance());
    }

}
