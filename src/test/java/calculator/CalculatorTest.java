package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test public void TestAddFuntion() {
        Calculator cal = new Calculator();
        assertEquals("calculator should return 5+10 = 15", cal.add(5, 10), 15);
    }

    @Test public void TestSubtractfuntion() {
        Calculator cal = new Calculator();
        assertEquals("calculator should return 5+10 = 15", cal.subtract(10, 5),5);
    }

    @Test public void Testmultiplyfuntion() {
        Calculator cal = new Calculator();
        assertEquals("calculator should return 5*10 = 50", cal.multiply(5, 10),50);
    }

    @Test public void Testaddfuntion() {
        Calculator cal = new Calculator();
        assertEquals("calculator should return 10/5 = 2", cal.divide(10, 5), 2);
    }

}

