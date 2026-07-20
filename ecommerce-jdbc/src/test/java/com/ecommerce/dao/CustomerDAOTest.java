package com.ecommerce.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ecommerce.model.Customer;

class CustomerDAOTest {

    private CustomerDAO customerDAO;

    @BeforeEach
    void setUp() {

        customerDAO = new CustomerDAO();

    }

    @Test
    void testRegisterCustomer() {

        Customer customer = new Customer();

        customer.setName("JUnit User");
        customer.setEmail("user" + System.currentTimeMillis() + "@gmail.com");
        customer.setPassword("1234");
        customer.setAddress("Bangalore");

        assertTrue(customerDAO.registerCustomer(customer));

    }

    @Test
    void testLoginCustomerSuccess() {

        String email = "login" + System.currentTimeMillis() + "@gmail.com";

        Customer customer = new Customer();

        customer.setName("Login User");
        customer.setEmail(email);
        customer.setPassword("1234");
        customer.setAddress("Delhi");

        customerDAO.registerCustomer(customer);

        Customer result = customerDAO.loginCustomer(email, "1234");

        assertNotNull(result);
        assertEquals(email, result.getEmail());
        assertEquals("Login User", result.getName());

    }

    @Test
    void testLoginCustomerInvalidPassword() {

        Customer result =
                customerDAO.loginCustomer("wrong@gmail.com", "abcd");

        assertNull(result);

    }

    @Test
    void testEmailExists() {

        String email = "exists" + System.currentTimeMillis() + "@gmail.com";

        Customer customer = new Customer();

        customer.setName("Exists User");
        customer.setEmail(email);
        customer.setPassword("1234");
        customer.setAddress("Mumbai");

        customerDAO.registerCustomer(customer);

        assertTrue(customerDAO.emailExists(email));

    }

    @Test
    void testEmailDoesNotExist() {

        assertFalse(
                customerDAO.emailExists("notfound@gmail.com"));

    }

    @Test
    void testDuplicateEmailRegistration() {

        String email = "duplicate" + System.currentTimeMillis() + "@gmail.com";

        Customer customer1 = new Customer();

        customer1.setName("User One");
        customer1.setEmail(email);
        customer1.setPassword("1234");
        customer1.setAddress("Pune");

        Customer customer2 = new Customer();

        customer2.setName("User Two");
        customer2.setEmail(email);
        customer2.setPassword("5678");
        customer2.setAddress("Mumbai"); 

        assertTrue(customerDAO.registerCustomer(customer1));

        assertFalse(customerDAO.registerCustomer(customer2));

    }
    
    @Test
    void testRegisterCustomerWithEmptyValues() {
        Customer customer = new Customer();
        assertFalse(customerDAO.registerCustomer(customer));
    }
    

}