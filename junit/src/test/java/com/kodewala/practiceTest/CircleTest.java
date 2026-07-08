package com.kodewala.practiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.kodewala.practice.Circle;

class CircleTest {

    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle();
    }

    @Test
    void testArea() {
        assertEquals(78.5, circle.area(5));
    }
}