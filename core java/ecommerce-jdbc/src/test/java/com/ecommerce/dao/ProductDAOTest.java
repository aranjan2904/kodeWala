package com.ecommerce.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ecommerce.model.Product;

class ProductDAOTest {

    private ProductDAO productDAO;

    @BeforeEach
    void setUp() {

        productDAO = new ProductDAO();

    }

    @Test
    void testAddProduct() {

        Product product = new Product();

        product.setSellerId(1);
        product.setName("JUnit Mouse " + System.currentTimeMillis());
        product.setDescription("Wireless Mouse");
        product.setPrice(499);
        product.setStockQuantity(10);

        assertTrue(productDAO.addProduct(product));
    }

    @Test
    void testGetAllProducts() {

        ArrayList<Product> list = productDAO.getAllProducts();

        assertNotNull(list);
        assertFalse(list.isEmpty());
    }

    @Test
    void testSearchProductFound() {

        ArrayList<Product> list = productDAO.searchProduct("Mouse");

        assertNotNull(list);
    }

    @Test
    void testSearchProductNotFound() {

        ArrayList<Product> list =
                productDAO.searchProduct("XYZ123456");

        assertTrue(list.isEmpty());
    }

    @Test
    void testGetProductById() {

        Product product = productDAO.getProductById(1);

        assertNotNull(product);
    }

    @Test
    void testGetProductByInvalidId() {

        Product product = productDAO.getProductById(99999);

        assertNull(product);
    }

    @Test
    void testUpdateProduct() {

        Product product = productDAO.getProductById(1);

        assertNotNull(product);

        product.setPrice(product.getPrice() + 10);

        assertTrue(productDAO.updateProduct(product));
    }

    @Test
    void testGetSellerProducts() {

        ArrayList<Product> list =
                productDAO.getSellerProducts(1);

        assertNotNull(list);
    }

    @Test
    void testUploadProducts() throws Exception {

        File file = File.createTempFile("products", ".csv");

        FileWriter writer = new FileWriter(file);

        writer.write("Keyboard,Mechanical Keyboard,1500,20\n");
        writer.write("Headphone,Bluetooth Headphone,2000,15\n");

        writer.close();

        int count = productDAO.uploadProducts(
                file.getAbsolutePath(), 1);

        assertEquals(2, count);

        file.delete();

    }

}