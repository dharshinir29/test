import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculateMethodTest {
   private CalculateMethod calculateMethod=new CalculateMethod();
    @Test
    public void testDivide()
    {
        assertEquals(10,calculateMethod.Divide(100,10));
    }

    @Test public void testDivideZero()
    {
       assertThrows(ArithmeticException.class,()->calculateMethod.Divide(100,0));
    }
}
