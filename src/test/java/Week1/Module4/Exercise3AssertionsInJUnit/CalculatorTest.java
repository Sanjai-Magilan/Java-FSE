package Week1.Module4.Exercise3AssertionsInJUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAssertions() {
        Calculator calc = new Calculator();
        // assertEquals
        assertEquals(5, calc.add(2, 3));
        // assertTrue
        assertTrue(calc.add(2, 3) > 0);
        // assertFalse
        assertFalse(calc.sub(2, 5) > 0);
        // assertNull
        String name = null;
        assertNull(name);
        // assertNotNull
        assertNotNull(calc);
    }
}