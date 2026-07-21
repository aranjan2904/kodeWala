package com.kodewala.practiceTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.kodewala.practice.Employee;

class EmployeeTest {

    Employee employee;

    @BeforeAll
    static void start() {
        System.out.println("Employee Test Started");
    }

    @BeforeEach
    void init() {
        employee = new Employee();
    }

    @Test
    void testSalary() {
        assertEquals(24000, employee.calculateSalary(20000));
    }

    @AfterEach
    void finishEach() {
        System.out.println("One Test Completed");
    }

    @AfterAll
    static void finish() {
        System.out.println("Employee Test Finished");
    }
}