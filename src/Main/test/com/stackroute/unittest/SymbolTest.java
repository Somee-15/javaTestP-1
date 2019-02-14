package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SymbolTest {
    Symbol s;

    @Before
    public void setUp() throws Exception {
        s = new Symbol();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void symbolchecker() {
        boolean expected = true;
        boolean actualValue = s.symbolchecker('c');
        assertEquals(expected, actualValue);

        boolean expected1 = true;
        boolean actualValue1 = s.symbolchecker('C');
        assertEquals(expected1, actualValue1);

        boolean expected2 = true;
        boolean actualValue2 = s.symbolchecker('1');
        assertEquals(expected2, actualValue2);

        boolean expected3 = true;
        boolean actualValue3 = s.symbolchecker('@');
        assertEquals(expected3, actualValue3);
    }
}