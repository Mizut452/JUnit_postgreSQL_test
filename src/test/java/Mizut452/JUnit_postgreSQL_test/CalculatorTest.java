package Mizut452.JUnit_postgreSQL_test;

import Mizut452.JUnit_postgreSQL_test.test_target.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        int expected = 10;
        int actual = calculator.multiply(2, 5);
        Assertions.assertEquals(expected, actual);
    }
}
