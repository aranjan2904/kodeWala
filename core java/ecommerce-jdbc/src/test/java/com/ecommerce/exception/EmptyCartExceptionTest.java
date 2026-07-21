package com.ecommerce.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmptyCartExceptionTest {

    @Test
    void testEmptyCartException() {

        EmptyCartException exception =
                new EmptyCartException("Cart is empty.");

        assertEquals("Cart is empty.", exception.getMessage());
        assertTrue(exception instanceof RuntimeException);
    }

} 