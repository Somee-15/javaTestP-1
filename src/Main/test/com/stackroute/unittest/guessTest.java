package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class guessTest {
    guess g;

    @Before
    public void setUp() throws Exception {
        g = new guess();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void guessing() {
        /*long expectedValue=1234321;
        long actualValue=p.palcheck(1234321);

        assertEquals(expectedValue,actualValue);
        long expectedValue1=1234;
        long actualValue1=p.palcheck(1234);

        assertNotEquals(expectedValue1,actualValue1);*/
        boolean expected = true;
        boolean actual = g.guessing(25);
        assertEquals(expected, actual);
    }
}