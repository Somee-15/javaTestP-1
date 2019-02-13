package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {
    palindrome p;
    @Before
    public void setUp() throws Exception {
       p=new palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void palcheck() {
        /* //Arrange
        String expectedValue="fffBCA";

        //Act
        String actualValue=app.concatAndConvertString("bc", "A");
        //Assert
           assertNotNull(actualValue);*/
        long expectedValue=1234321;
        long actualValue=p.palcheck(1234321);

        assertEquals(expectedValue,actualValue);
        long expectedValue1=1234;
        long actualValue1=p.palcheck(1234);

        assertNotEquals(expectedValue1,actualValue1);
    }
}