package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class stringReverseTest {
    stringReverse s1;
    @Before
    public void setUp() throws Exception {
        s1=new stringReverse();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverse() {
        boolean expected=true;
        boolean actual=s1.reverse("MALAYALAM");
    }
}