package com.ecommerce.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ecommerce.model.Seller;

class SellerDAOTest {

    private SellerDAO sellerDAO;

    @BeforeEach
    void setUp() {

        sellerDAO = new SellerDAO();

    }

    @Test
    void testRegisterSeller() {

        Seller seller = new Seller();

        seller.setName("JUnit Seller");
        seller.setEmail("seller" + System.currentTimeMillis() + "@gmail.com");
        seller.setPassword("1234");
        seller.setShopName("JUnit Shop");

        assertTrue(sellerDAO.registerSeller(seller));

    }

    @Test
    void testLoginSellerSuccess() {

        String email = "login" + System.currentTimeMillis() + "@gmail.com";

        Seller seller = new Seller();

        seller.setName("Login Seller");
        seller.setEmail(email);
        seller.setPassword("1234");
        seller.setShopName("ABC Store");

        sellerDAO.registerSeller(seller);

        Seller result = sellerDAO.loginSeller(email, "1234");

        assertNotNull(result);
        assertEquals(email, result.getEmail());
        assertEquals("Login Seller", result.getName());

    }

    @Test
    void testLoginSellerInvalidPassword() {

        Seller result =
                sellerDAO.loginSeller("wrong@gmail.com", "abcd");

        assertNull(result);

    }

    @Test
    void testEmailExists() {

        String email = "exists" + System.currentTimeMillis() + "@gmail.com";

        Seller seller = new Seller();

        seller.setName("Exists Seller");
        seller.setEmail(email);
        seller.setPassword("1234");
        seller.setShopName("Shop");

        sellerDAO.registerSeller(seller);

        assertTrue(sellerDAO.emailExists(email));

    }

    @Test
    void testEmailDoesNotExist() {

        assertFalse(
                sellerDAO.emailExists("notfound@gmail.com"));

    }

    @Test
    void testDuplicateSellerRegistration() {

        String email = "duplicate" + System.currentTimeMillis() + "@gmail.com";

        Seller seller1 = new Seller();

        seller1.setName("Seller One");
        seller1.setEmail(email);
        seller1.setPassword("1234");
        seller1.setShopName("Shop One");

        Seller seller2 = new Seller();

        seller2.setName("Seller Two");
        seller2.setEmail(email);
        seller2.setPassword("5678");
        seller2.setShopName("Shop Two");

        assertTrue(sellerDAO.registerSeller(seller1));

        assertFalse(sellerDAO.registerSeller(seller2));

    }
    @Test
    void testRegisterSellerWithEmptyValues() {

        Seller seller = new Seller();

        assertFalse(sellerDAO.registerSeller(seller));

    }
    
 
    
    @Test
    void testLoginSellerWrongEmail() {

        Seller seller = sellerDAO.loginSeller(
                "wrongemail@gmail.com",
                "1234");

        assertNull(seller);

    }
    
    
    @Test
    void testLoginSellerWrongPassword() {

        String email = "seller" + System.currentTimeMillis() + "@gmail.com";

        Seller seller = new Seller();

        seller.setName("JUnit");
        seller.setEmail(email);
        seller.setPassword("1234");
        seller.setShopName("Shop");

        sellerDAO.registerSeller(seller);

        Seller result = sellerDAO.loginSeller(email, "wrong");

        assertNull(result);

    }
    

}