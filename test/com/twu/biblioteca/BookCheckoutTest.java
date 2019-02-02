package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookCheckoutTest {
    private BookCheckout checkOutTest;
    @Before
    public void checkout() {
        checkOutTest = new BookCheckout();
    }

    @Test
    public void testCheckOut() {

        assertEquals(true, false);
    }
}
