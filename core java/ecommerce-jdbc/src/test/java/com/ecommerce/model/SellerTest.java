package com.ecommerce.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SellerTest {

    @Test
    void testDefaultConstructorAndSetters() {

        Seller seller = new Seller();

        seller.setSellerId(1);
        seller.setName("Ranjan");
        seller.setEmail("ranjan@gmail.com");
        seller.setPassword("1234");
        seller.setShopName("Tech Store");

        assertEquals(1, seller.getSellerId());
        assertEquals("Ranjan", seller.getName());
        assertEquals("ranjan@gmail.com", seller.getEmail());
        assertEquals("1234", seller.getPassword());
        assertEquals("Tech Store", seller.getShopName());
    } 

    @Test
    void testParameterizedConstructorWithoutId() {

        Seller seller = new Seller(
                "Rahul",
                "rahul@gmail.com",
                "abcd",
                "Mobile World");

        assertEquals("Rahul", seller.getName());
        assertEquals("rahul@gmail.com", seller.getEmail());
        assertEquals("abcd", seller.getPassword());
        assertEquals("Mobile World", seller.getShopName());
    }

    @Test
    void testParameterizedConstructorWithId() {

        Seller seller = new Seller(
                101,
                "Amit",
                "amit@gmail.com",
                "1234",
                "Laptop Hub");

        assertEquals(101, seller.getSellerId());
        assertEquals("Amit", seller.getName());
        assertEquals("amit@gmail.com", seller.getEmail());
        assertEquals("1234", seller.getPassword());
        assertEquals("Laptop Hub", seller.getShopName());
    }

    @Test
    void testToString() {

        Seller seller = new Seller(
                1,
                "Ranjan",
                "ranjan@gmail.com",
                "1234",
                "Tech Store");

        String expected = "1 | Ranjan | Tech Store";

        assertEquals(expected, seller.toString());
    }

    @Test
    void testObjectNotNull() {

        Seller seller = new Seller();

        assertNotNull(seller);
    }

}