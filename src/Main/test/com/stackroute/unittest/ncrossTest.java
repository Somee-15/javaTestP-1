package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ncrossTest {
    ncross n;
    @Before
    public void setUp() throws Exception {
        n=new ncross();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void cross() {
        boolean expected=true;
        boolean actualValue=n.cross(5);
        assertEquals(expected,actualValue);
    }
}