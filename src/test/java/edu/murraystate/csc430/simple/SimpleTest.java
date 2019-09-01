package edu.murraystate.csc430.simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {
    @Test
    public void simpleTest(){
        final String expected = "Hello!";
        final Simple simple = new Simple(expected);
        final String result = simple.getContents();
        Assert.assertEquals(expected, result);
    }
}
