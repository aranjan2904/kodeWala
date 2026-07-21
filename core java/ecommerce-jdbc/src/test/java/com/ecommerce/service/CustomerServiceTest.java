package com.ecommerce.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ecommerce.dao.CustomerDAO;
import com.ecommerce.exception.DuplicateEmailException;
import com.ecommerce.model.Customer;

class CustomerServiceTest {

    private CustomerService service;
    private CustomerDAO customerDAO;

    @BeforeEach
    void setUp() throws Exception {

        service = new CustomerService();

        customerDAO = mock(CustomerDAO.class);

        Field daoField = CustomerService.class.getDeclaredField("customerDAO");
        daoField.setAccessible(true);
        daoField.set(service, customerDAO);
    }

    private void setInput(String input) throws Exception {

        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));

        Field scannerField = CustomerService.class.getDeclaredField("sc");
        scannerField.setAccessible(true);
        scannerField.set(service, scanner);
    }

    @Test
    void testCustomerRegistrationSuccess() throws Exception {

        setInput("""
                John
                john@gmail.com
                pass123
                Bangalore
                """);

        when(customerDAO.emailExists("john@gmail.com")).thenReturn(false);
        when(customerDAO.registerCustomer(any(Customer.class))).thenReturn(true);

        Customer customer = service.customerRegistration();

        assertNotNull(customer);
        assertEquals("John", customer.getName());
        assertEquals("john@gmail.com", customer.getEmail());

        verify(customerDAO).registerCustomer(any(Customer.class));
    }

    @Test
    void testCustomerRegistrationDuplicateEmail() throws Exception {

        setInput("""
                John
                john@gmail.com
                pass123
                Bangalore
                """);

        when(customerDAO.emailExists("john@gmail.com")).thenReturn(true);

        assertThrows(DuplicateEmailException.class,
                () -> service.customerRegistration());

        verify(customerDAO, never()).registerCustomer(any());
    }

    @Test
    void testCustomerLoginSuccess() throws Exception {

        setInput("""
                john@gmail.com
                pass123
                """);

        Customer customer = new Customer();
        customer.setName("John");

        when(customerDAO.loginCustomer("john@gmail.com", "pass123"))
                .thenReturn(customer);

        Customer result = service.customerLogin();

        assertNotNull(result);
        assertEquals("John", result.getName());
    }

    @Test
    void testCustomerLoginFailure() throws Exception {

        setInput("""
                wrong@gmail.com
                wrong
                """);

        when(customerDAO.loginCustomer(anyString(), anyString()))
                .thenReturn(null);

        Customer result = service.customerLogin();

        assertNull(result);
    }

    @Test
    void testRegistrationRejectsEmptyName() throws Exception {

        setInput("""
                
                John
                john@gmail.com
                pass123
                Bangalore
                """);

        when(customerDAO.emailExists(anyString())).thenReturn(false);
        when(customerDAO.registerCustomer(any())).thenReturn(true);

        Customer customer = service.customerRegistration();

        assertEquals("John", customer.getName());
    }

    @Test
    void testRegistrationRejectsInvalidEmail() throws Exception {

        setInput("""
                John
                abc
                john@gmail.com
                pass123
                Bangalore
                """);

        when(customerDAO.emailExists("john@gmail.com")).thenReturn(false);
        when(customerDAO.registerCustomer(any())).thenReturn(true);

        Customer customer = service.customerRegistration();

        assertEquals("john@gmail.com", customer.getEmail());
    }
}