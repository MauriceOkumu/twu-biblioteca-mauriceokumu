package com.twu.biblioteca;
import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.assertEquals;


public class MenuTest {
    private Menu menuTest;
    @Before
    public void createMenu() {
        menuTest = new Menu();
        menuTest.menu.add("List of Books");
    }

    @Test
    public void testMenu() {
        assertEquals(menuTest.menu.size(), 1);
    }
}
