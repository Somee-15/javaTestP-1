package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class repeatTest {
    repeat r;

    @Before
    public void setUp() throws Exception {
        r = new repeat();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void repeater() {
        boolean expected = true;
        boolean actual = r.repeater("Sachin", 2);
    }
}