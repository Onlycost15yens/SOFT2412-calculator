package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest_2 {
    @Test public void DivideByZero() {
        try {
            Calculator cal = new Calculator();
            cal.divide(10,0);
          }
          catch (Exception e) {
            assertSame("Wrong output for dividing by zero ",e.getMessage(), "Cannot divide by 0");
          }
    }

    @Test public void TestingMainFunction(){
        Calculator.main(null);
    }
}

