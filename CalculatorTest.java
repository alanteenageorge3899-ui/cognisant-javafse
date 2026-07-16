package com.cognizant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAssertEquals() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(20, calculator.subtract(10, 5));
    }

    @Test
    void testAssertTrue() {
        assertTrue(calculator.multiply(4, 5) == 20);
    }

    @Test
    void testAssertFalse() {
        assertFalse(calculator.divide(20, 5) == 3);
    }

    @Test
    void testAssertNull() {
        assertNull(calculator.getNullObject());
    }

    @Test
    void testAssertNotNull() {
        assertNotNull(calculator.getObject());
    }

    @Test
    void testAssertSame() {
        String text = calculator.getMessage();
        assertSame(text, text);
    }
}