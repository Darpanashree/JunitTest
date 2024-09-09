package com.tnsif.testing;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumDemo {

    @Test
    public void testAssumption() {
        int a = 5, s = 25;

        // Assumption to check if 's' is not equal to 'a * a'
        Assumptions.assumeTrue(s != a * a);

        // This statement will only be executed if the assumption is true
        System.out.println("The assumption is true, so this message will be displayed.");
    }
}
