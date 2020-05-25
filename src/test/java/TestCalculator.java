import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(4, calculator.add(3,1));
    }

    @Test
    public void sub(){
        assertEquals(5, calculator.sub(10, 5));
    }

    @Test
    public void mul(){
        assertEquals(15, calculator.mul(3, 5));
    }

}
