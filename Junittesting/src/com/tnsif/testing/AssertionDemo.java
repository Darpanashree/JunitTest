package com.tnsif.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AssertionDemo {

    @Test
    public void checkAssertEqual() {
        int res = 1;  // Changed res to 1 to match exp
        int exp = 1;

        assertEquals(res, exp); // This assertion will pass because res is equal to exp
    }

    @Test
    public void testCheckAssertEqual() {
        assertFalse("Hello".contains("m")); // This assertion will pass because "Hello" does not contain "m"
    }

    @Test
    public void testNotNull() {
        String s = "hello";  // Changed s to a non-null value
        assertNotNull(s); // This assertion will pass because s is not null
    }
}



