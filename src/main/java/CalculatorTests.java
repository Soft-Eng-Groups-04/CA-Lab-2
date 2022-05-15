import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;


class CalculatorTests {

    @Test
    @DisplayName("2 + 2 = 4")
    void addNumberTest()
    {
       final int expected = 4;
       final int actual = Math.addExact(2, 2);
       assertEquals(expected, actual);
    }

    @Test
    @DisplayName("addExact Overflow Exception")
    void addNumberExceptionTest()
    {
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            Math.addExact(Integer.MAX_VALUE, 200);
        });
    }

    @Test
    @DisplayName("10 / 2 = 5")
    void divideIntegerTest()
    {
        final int expected = 5;
        final int actual = Math.divideExact(10, 2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName ("divideExact Division by 0 Exception")
    void divideByZeroExceptionTest()
    {
        ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
            Math.divideExact(3, 0);
        });
    }

}
