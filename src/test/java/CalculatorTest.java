import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {


    public Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAddTwoNumbersTogether() {
        assertEquals(7, calculator.addNumbers(4, 3));
    }

    @Test
    public void canSubtractTwoNumbers() {
        assertEquals(3, calculator.subtractNumbers(9, 6));
    }

    @Test
    public void canMultiplyTwoNumbers(){
        assertEquals(12, calculator.multiplyNumbers(2, 6));
    }

    @Test
    public void canDivideTwoNumbers() {
        assertEquals(2, calculator.divideNumbers(12, 6));
    }

}
