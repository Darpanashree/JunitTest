package com.tnsif.testing;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Objects;

public class FactorialTest {

    // Method to calculate factorial
    public Long factorial(Integer number) {
        if (number == null || number < 0) {
            throw new IllegalArgumentException("Number must be non-null and non-negative");
        }
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    @Test
    public void testFactorialPositive() {
        Integer num = 5;

        // Assumption: test will be skipped if num is not greater than 0
        assumeTrue(num > 0, "Number is not positive, skipping the test.");

        // If the assumption passes, this code will run
        long expected = 120;
        long actual = factorial(num);
        assertEquals(expected, actual, "Factorial calculation failed");
    }

    @Test
    public void testFactorialNegative() {
        Integer num = -3;

        // Assumption: test will be skipped if num is greater than or equal to 0
        assumeFalse(num >= 0, "Number is non-negative, skipping the test.");

        // The following code will not execute if the assumption fails
        // As we expect this test to be skipped, we don't need to call factorial here
        assertThrows(IllegalArgumentException.class, () -> factorial(num), "Expected an IllegalArgumentException for negative input.");
    }

    @Test
    public void testFactorialNull() {
        Integer num = null;

        // Assumption: test will be skipped if num is not null
        assumeTrue(Objects.isNull(num), "Number is not null, skipping the test.");

        // The following code will not execute if the assumption fails
        // As we expect this test to be skipped, we don't need to call factorial here
        assertThrows(IllegalArgumentException.class, () -> factorial(num), "Expected an IllegalArgumentException for null input.");
    }
}
