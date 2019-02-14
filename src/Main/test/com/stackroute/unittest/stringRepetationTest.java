package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class stringRepetationTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void subString() {
        stringRepetation strrpt=new stringRepetation();
        String expected="stackroutetete";
        String actual=strrpt.subString("stackroute",2);
        assertEquals(expected,actual);
    }

    @Test
    public void subString2() {
        stringRepetation strrpt=new stringRepetation();
        String expected="stackroutetete";
        String actual=strrpt.subString("stackroute",3);
        assertNotEquals(expected,actual);
    }

}