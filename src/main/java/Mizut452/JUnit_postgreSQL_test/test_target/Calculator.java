package Mizut452.JUnit_postgreSQL_test.test_target;

public class Calculator {
    public int multiply(int x, int y) {
        return x * y;
    }

    public float divide(float x, float y) {
        if(y == 0) throw new IllegalArgumentException("０で割られました");
        return x / y;
    }
}
