package com.kodewala.junitTest2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.kodewala.junit2.FoodOrder;

class FoodOrderTest {

	FoodOrder order;

	@BeforeEach
	void setup() {
		order = new FoodOrder();
	}
	@Test
	void testSave10Coupon() {

	    int amount = 1000;
	    String coupon = "SAVE10";

	    int expected = 900;

	    double actual = order.calculateBill(amount, coupon);

	    assertEquals(expected, actual);
	}

	@Test
	void testSave20Coupon() {

	    int amount = 1000;
	    String coupon = "SAVE20";

	    int expected = 800;

	    double actual = order.calculateBill(amount, coupon);

	    assertEquals(expected, actual);
	}

	@Test
	void testFlat100Coupon() {

	    int amount = 1200;
	    String coupon = "FLAT100";

	    int expected = 1100;

	    double actual = order.calculateBill(amount, coupon);

	    assertEquals(expected, actual);
	}
}