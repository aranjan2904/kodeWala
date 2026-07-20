package com.ecommerce.main;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

import com.ecommerce.Main;

class MainTest {
 
    @Test
    void testExitApplication() {

        String input = "0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }

    @Test
    void testInvalidMainChoice() {

        String input =
                "9\n" +
                "0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }

    @Test
    void testCharacterInputMainMenu() {

        String input =
                "abc\n" +
                "0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }

    @Test
    void testSellerHomeBack() {

        String input =
                "1\n" +
                "0\n" +
                "0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }

    @Test
    void testCustomerHomeBack() {

        String input =
                "2\n" +
                "0\n" +
                "0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }

    
    @Test
    void testInvalidSellerMenuChoice() {

        String input =
                "1\n" +
                "9\n" +
                "0\n" +
                "0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }
    
    @Test
    void testInvalidCustomerMenuChoice() {

        String input =
                "2\n" +
                "9\n" +
                "0\n" +
                "0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }
    
    @Test
    void testSellerMenuCharacterInput() {

        String input =
                "1\n" +
                "abc\n" +
                "0\n" +
                "0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }
    
    
    @Test
    void testCustomerMenuCharacterInput() {

        String input =
                "2\n" +
                "abc\n" +
                "0\n" +
                "0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }
    
    @Test
    void testViewProducts() {

        String input =
                "2\n" +
                "1\n" +
                "0\n" +
                "0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[] {}));
    }
    

    
 
}
