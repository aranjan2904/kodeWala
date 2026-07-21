package com.kodewala.junitTest2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.kodewala.junit2.MovieTicket;

class MovieTicketTest {

    MovieTicket ticket;

    @BeforeEach
    void setup() {
        ticket = new MovieTicket();
    }

    @Test
    void testStudentDiscount() {

        assertEquals(400, ticket.calculatePrice(500, "STUDENT"));
    }

    @Test
    void testSeniorDiscount() {

        assertEquals(350, ticket.calculatePrice(500, "SENIOR"));
    }

    @Test
    void testChildDiscount() {

        assertEquals(250, ticket.calculatePrice(500, "CHILD"));
    }
}