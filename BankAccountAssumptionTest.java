import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;

public class BankAccountAssumptionTest {
    @Test

    public void testAssumption(){
        BankAccount bankAccount=new BankAccount(1000,0);
        assumeTrue(bankAccount ==null);
    }
}
