package com.ecommerce.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    void testDefaultConstructorAndSetters() {

        Product product = new Product();

        product.setProductId(1);
        product.setSellerId(10);
        product.setName("Laptop");
        product.setDescription("Gaming Laptop");
        product.setPrice(65000.00);
        product.setStockQuantity(5);

        assertEquals(1, product.getProductId());
        assertEquals(10, product.getSellerId());
        assertEquals("Laptop", product.getName());
        assertEquals("Gaming Laptop", product.getDescription());
        assertEquals(65000.00, product.getPrice());
        assertEquals(5, product.getStockQuantity());
    }

    @Test
    void testParameterizedConstructorWithoutId() {

        Product product = new Product(
                10,
                "Mouse",
                "Wireless Mouse",
                599.00,
                20);

        assertEquals(10, product.getSellerId());
        assertEquals("Mouse", product.getName());
        assertEquals("Wireless Mouse", product.getDescription());
        assertEquals(599.00, product.getPrice());
        assertEquals(20, product.getStockQuantity());
    }

    @Test
    void testParameterizedConstructorWithId() {

        Product product = new Product(
                100,
                10,
                "Keyboard",
                "Mechanical Keyboard",
                1999.00,
                15);

        assertEquals(100, product.getProductId());
        assertEquals(10, product.getSellerId());
        assertEquals("Keyboard", product.getName());
        assertEquals("Mechanical Keyboard", product.getDescription());
        assertEquals(1999.00, product.getPrice());
        assertEquals(15, product.getStockQuantity());
    }

    @Test
    void testToString() {

        Product product = new Product(
                1,
                10,
                "Mouse",
                "Wireless",
                499.00,
                20);

        String expected = String.format(
                "%-5d %-25s ₹%-10.2f Stock : %d",
                1,
                "Mouse",
                499.00,
                20);

        assertEquals(expected, product.toString());
    }

    @Test
    void testObjectNotNull() {

        Product product = new Product();

        assertNotNull(product);
    }

}