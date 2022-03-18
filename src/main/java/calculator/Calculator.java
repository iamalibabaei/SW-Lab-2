package calculator;

import java.lang.Math;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public float divide(int value1, int value2) {
        return (float) ((value1 * 1.0) / (value2 * 1.0));
    }

    public float sqrt(float value1) {
        return (float) Math.sqrt(value1);
    }
}