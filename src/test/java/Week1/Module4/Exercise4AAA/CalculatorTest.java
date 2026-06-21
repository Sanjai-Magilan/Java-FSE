package Week1.Module4.Exercise4AAA;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calc;
    // Setup
    @BeforeEach
    public void setup() {
        System.out.println("Setup");
        calc = new Calculator();
    }
    // Teardown
    @AfterEach
    public void teardown() {
        System.out.println("Teardown");
        calc = null;
    }

    @Test
    public void testAdd() {

        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calc.add(a, b);

        // Assert
        assertEquals(5, result);
    }
}