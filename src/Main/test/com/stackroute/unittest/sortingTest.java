package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class sortingTest {
    sorting s;
    @Before
    public void setUp() throws Exception {
        s=new sorting();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sort() {
        boolean expected=true;
        boolean actual=s.sort(987654321);
        assertEquals(expected,actual);
    }
}