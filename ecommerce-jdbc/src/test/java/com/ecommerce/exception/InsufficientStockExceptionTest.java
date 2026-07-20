package com.ecommerce.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InsufficientStockExceptionTest {

    @Test
    void testInsufficientStockException() {

        InsufficientStockException exception =
                new InsufficientStockException("Insufficient Stock.");

        assertEquals("Insufficient Stock.", exception.getMessage());
        assertTrue(exception instanceof Exception);
    }
}