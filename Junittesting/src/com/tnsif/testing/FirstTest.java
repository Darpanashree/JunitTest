package com.tnsif.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTest {
	@Disabled()
	@DisplayName ("MY Test 1")
    @Test
    void display() {
        System.out.println("My test method");
    }
	@DisplayName ("MY Test 2")
    @Test
    void hello() {
        System.out.println("greet");
    }
}
