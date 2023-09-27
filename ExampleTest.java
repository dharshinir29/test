import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    Example example=new Example();
    @Test
    public void testhello(){
        Assertions.assertEquals("Hello World",example.hello());
    }
}

