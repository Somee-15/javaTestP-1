package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class inputTest {
    input i;

    @Before
    public void setUp() throws Exception {
        i = new input();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void validator() {
        boolean expected = true;
        boolean actual = i.validator(25);
        assertEquals(expected, actual);

        boolean expected1 = true;
        boolean actual1 = i.validator(24);
        assertEquals(expected1, actual1);

    }
}