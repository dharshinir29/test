import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest {
    Demo demo=new Demo();

    @Test
    public void testhello(){
        Assertions.assertEquals("Hello World!",demo.hello());
    }
}
