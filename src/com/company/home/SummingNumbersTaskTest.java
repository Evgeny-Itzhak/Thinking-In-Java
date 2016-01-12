package com.company.home;

import static org.junit.Assert.*;


public class SummingNumbersTaskTest {

    @org.junit.Before
    public void setUp() throws Exception {



    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testSumNumbers() throws Exception {
        int testNumberSum = 45;
        assertEquals("Test number sum don't equals \"testNumberSum\"", testNumberSum, SummingNumbersTask.sumNumbers(1234567891));

    }


}