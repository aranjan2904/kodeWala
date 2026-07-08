package com.kodewala.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumberCheckTest {

    @Test
    public void testIsEven() {
        NumberCheck obj = new NumberCheck();

        assertTrue(obj.isEven(8));
    }
}
