import static org.junit.Assert.*;
import org.junit.*;

public class skill_demo_test {
    @Test
    public void test_multiply() {
        assertEquals(2, skill_demo.multiply(1, 2)); // Now the test works
    }
}