import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorMockTests {


   CalculatorProgram calculatorProgram = null;

   @Mock
   CalculatorClass calculationBackend;

   @Rule
   public MockitoRule rule = MockitoJUnit.rule();

   @Before
   public void setUp()
   {
       calculatorProgram = new CalculatorProgram(calculationBackend);
   }

    @Test
    public void addExactTest()
    {
        when(calculationBackend.addExact(2, 2)).thenReturn(4);

        final int expected = 4;
        final int actual = calculatorProgram.addExact(2, 2);
        assertEquals(expected, actual);
    }
}
