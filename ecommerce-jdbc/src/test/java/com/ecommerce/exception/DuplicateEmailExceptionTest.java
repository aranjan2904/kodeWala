package com.ecommerce.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DuplicateEmailExceptionTest {

    @Test
    void testDuplicateEmailException() {

        DuplicateEmailException exception =
                new DuplicateEmailException("Email already exists.");

        assertEquals("Email already exists.", exception.getMessage());
        assertTrue(exception instanceof Exception);
    }
}