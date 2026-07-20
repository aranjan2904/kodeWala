package com.ecommerce.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CustomerTest {

    @Test
    void testDefaultConstructorAndSetters() {

        Customer customer = new Customer();

        customer.setCustomerId(1);
        customer.setName("Ranjan");
        customer.setEmail("ranjan@gmail.com");
        customer.setPassword("1234");
        customer.setAddress("Bangalore");

        assertEquals(1, customer.getCustomerId());
        assertEquals("Ranjan", customer.getName());
        assertEquals("ranjan@gmail.com", customer.getEmail());
        assertEquals("1234", customer.getPassword());
        assertEquals("Bangalore", customer.getAddress());
    }

    @Test
    void testParameterizedConstructorWithoutId() {

        Customer customer = new Customer(
                "Rahul",
                "rahul@gmail.com",
                "abcd",
                "Delhi");

        assertEquals("Rahul", customer.getName());
        assertEquals("rahul@gmail.com", customer.getEmail());
        assertEquals("abcd", customer.getPassword());
        assertEquals("Delhi", customer.getAddress());
    }

    @Test
    void testParameterizedConstructorWithId() {

        Customer customer = new Customer(
                101,
                "Amit",
                "amit@gmail.com",
                "1234",
                "Mumbai");

        assertEquals(101, customer.getCustomerId());
        assertEquals("Amit", customer.getName());
        assertEquals("amit@gmail.com", customer.getEmail());
        assertEquals("1234", customer.getPassword());
        assertEquals("Mumbai", customer.getAddress());
    }

    @Test
    void testToString() {

        Customer customer = new Customer(
                1,
                "Ranjan",
                "ranjan@gmail.com",
                "1234",
                "Bangalore");

        String expected =
                "1 | Ranjan | ranjan@gmail.com | Bangalore";

        assertEquals(expected, customer.toString());
    }

    @Test
    void testObjectNotNull() {

        Customer customer = new Customer();

        assertNotNull(customer);
    }

}