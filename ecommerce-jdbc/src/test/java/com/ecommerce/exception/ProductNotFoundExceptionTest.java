package com.ecommerce.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductNotFoundExceptionTest {

    @Test
    void testProductNotFoundException() {

        ProductNotFoundException exception =
                new ProductNotFoundException("Product Not Found.");

        assertEquals("Product Not Found.", exception.getMessage());
    }
}