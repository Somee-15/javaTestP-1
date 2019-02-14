package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class vowelTest {
    vowel v;

    @Before
    public void setUp() throws Exception {
        v = new vowel();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void vowelChecker() {
        boolean expected = true;
        boolean actual = v.vowelChecker("BISWADEEP");
        assertEquals(expected, actual);

    }
}