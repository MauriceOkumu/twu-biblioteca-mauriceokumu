package com.twu.biblioteca;

import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.assertEquals;

public class BookListTest {
    private BookList testBookList;
    @Before
    public void initializeClass() throws Exception {
        testBookList =  new BookList();
        testBookList.populate();
    }
    @Test
    public void populateTest() {
        assertEquals(testBookList.list.get(2), "The Nest");
    }
    @Test
    public void showListTest() {
        assertEquals(testBookList.showList(), true);
    }
}
