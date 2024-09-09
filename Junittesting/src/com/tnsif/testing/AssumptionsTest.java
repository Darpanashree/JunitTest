package com.tnsif.testing;

import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;  // Import assertions

public class AssumptionsTest {  // Renamed the class

    // Method to calculate factorial
    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    @Test
    public void testFactorialPositive() {
        int num = 5;

        // Assumption: test will be skipped if num is negative (false condition)
        assumeFalse(num < 0, "Number is negative, skipping the test.");

        // If the assumption passes (num >= 0), this will run
        long expected = 120;
        long actual = factorial(num);
        assertEquals(expected, actual, "Factorial calculation failed");
    }

    @Test
    public void testFactorialNegative() {
        int num = -3;

        // This assumption will pass (num < 0), so the test will be skipped
        assumeFalse(num >= 0, "Number is non-negative, skipping the test.");

        // If the assumption fails (which it doesn't), this code would run
        long actual = factorial(num);
        assert false : "This test should have been skipped.";
    }
}
