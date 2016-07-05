package com.agile42.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by niels on 05-07-16.
 */
public class ExampleTest {

    private Example ex = null;

    @Before
    public void setUp() throws Exception {
        ex = new Example();
    }

    @After
    public void tearDown() throws Exception {
        ex = null;
    }

    @Test
    public void add() throws Exception {
        assertEquals(42, ex.multiply(6, 7));
    }

}