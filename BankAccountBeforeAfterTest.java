import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountBeforeAfterTest {

     static BankAccount bankAccount= new BankAccount(500, -1000);
     @BeforeAll
     public static void testBefore(){
         System.out.println("BeforeAll!");

     }
    @Test
    public void testWithdraw() {

        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());
    }

    @Test

    public void testDeposit() {

        bankAccount.deposit(500);
        assertEquals(700, bankAccount.getBalance());
    }
    @AfterAll
    public static void testAfter(){
         System.out.println("AfterAll!");
    }
}
