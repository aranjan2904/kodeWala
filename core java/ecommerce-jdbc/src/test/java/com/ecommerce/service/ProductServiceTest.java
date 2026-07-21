package com.ecommerce.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ecommerce.dao.ProductDAO;

class ProductServiceTest {

    private ProductService service;
    private ProductDAO productDAO;

    @BeforeEach
    void setUp() throws Exception {

        service = new ProductService();
        productDAO = mock(ProductDAO.class);

        Field daoField = ProductService.class.getDeclaredField("productDAO");
        daoField.setAccessible(true);
        daoField.set(service, productDAO);
    }

    private void setInput(String input) throws Exception {

        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        Field scannerField = ProductService.class.getDeclaredField("sc");
        scannerField.setAccessible(true);
        scannerField.set(service, scanner);
    }

    @Test
    void testAddProductSuccess() throws Exception {

        setInput("""
Laptop
Gaming Laptop
75000
10
""");

        when(productDAO.addProduct(any())).thenReturn(true);

        service.addProduct(1);

        verify(productDAO).addProduct(any());
    }

    @Test
    void testAddProductEmptyName() throws Exception {

        setInput("""

Gaming Laptop
75000
10
""");

        service.addProduct(1);

        verify(productDAO, never()).addProduct(any());
    }

    @Test
    void testAddProductEmptyDescription() throws Exception {

        setInput("""
Laptop

75000
10
""");

        service.addProduct(1);

        verify(productDAO, never()).addProduct(any());
    }

    @Test
    void testAddProductNegativePrice() throws Exception {

        setInput("""
Laptop
Gaming Laptop
-500
10
""");

        service.addProduct(1);

        verify(productDAO, never()).addProduct(any());
    }

    @Test
    void testAddProductZeroPrice() throws Exception {

        setInput("""
Laptop
Gaming Laptop
0
10
""");

        service.addProduct(1);

        verify(productDAO, never()).addProduct(any());
    }

    @Test
    void testAddProductNegativeStock() throws Exception {

        setInput("""
Laptop
Gaming Laptop
50000
-5
""");

        service.addProduct(1);

        verify(productDAO, never()).addProduct(any());
    }

}