package com.tnsif.testing;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.Objects;

public class FactorialCalculationTests {

    private static Integer num;

    @BeforeAll
    public static void setup() {
        // Set up any required data or configuration before all tests
        // For example, you could initialize the num variable here if needed
        num = 5; // Example value for demonstration purposes
    }

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

    @Nested
    @DisplayName("Tests with valid numbers")
    class ValidNumbers {

        @Test
        @DisplayName("Positive number")
        void testFactorialPositive() {
            assumeTrue(num > 0, "Number is not positive, skipping the test.");

            long expected = 120;
            long actual = factorial(num);
            assertEquals(expected, actual, "Factorial calculation failed");
        }

        @Test
        @DisplayName("Zero")
        void testFactorialZero() {
            assumeTrue(num != null, "Number is null, skipping the test.");

            long expected = 1;
            long actual = factorial(0);
            assertEquals(expected, actual, "Factorial of zero should be 1");
        }
    }

    @Nested
    @DisplayName("Tests with invalid numbers")
    class InvalidNumbers {

        @Test
        @DisplayName("Negative number")
        void testFactorialNegative() {
            Integer negativeNum = -3;

            // Assumption: skip the test if the number is not negative
            assumeTrue(negativeNum < 0, "Number is non-negative, skipping the test.");

            assertThrows(IllegalArgumentException.class, () -> factorial(negativeNum), "Expected an IllegalArgumentException for negative input.");
        }

        @Test
        @DisplayName("Null value")
        void testFactorialNull() {
            Integer nullNum = null;

            // Assumption: skip the test if the number is not null
            assumeTrue(Objects.isNull(nullNum), "Number is not null, skipping the test.");

            assertThrows(IllegalArgumentException.class, () -> factorial(nullNum), "Expected an IllegalArgumentException for null input.");
        }
    }
}
