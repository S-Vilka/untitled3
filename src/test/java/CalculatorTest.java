import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(0, Calculator.add(-2, 2));
        assertEquals(-5, Calculator.add(-2, -3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, Calculator.subtract(3, 2));
        assertEquals(-4, Calculator.subtract(-2, 2));
        assertEquals(0, Calculator.subtract(2, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, Calculator.multiply(2, 3));
        assertEquals(-4, Calculator.multiply(-2, 2));
        assertEquals(4, Calculator.multiply(-2, -2));
        assertEquals(0, Calculator.multiply(0, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, Calculator.divide(6, 3));
        assertEquals(-2, Calculator.divide(-6, 3));
        assertEquals(1, Calculator.divide(3, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
    }
}