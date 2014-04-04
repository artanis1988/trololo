package org.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Date: 4/4/14
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class PrevedTest {
    @Test
    public void testSay() throws Exception {
        assertEquals("MEDVED", new Preved().say());
    }
}
