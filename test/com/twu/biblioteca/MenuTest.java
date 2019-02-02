package com.twu.biblioteca;
import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.assertEquals;

//public class BookListTest {
//    private BookList testBookList;
//    @Before
//    public void initializeClass() throws Exception {
//        testBookList =  new BookList();
//        testBookList.populate();
//    }
//    @Test
//    public void populateTest() {
//        assertEquals(testBookList.list.get(1).get(1), "The Heightsing");
//    }
//    @Test
//    public void showListTest() {
//        assertEquals(testBookList.showList().length(),205);
//    }
//    @Test
//    public void checkList() {
//        assertEquals(testBookList.viewList().length(), 75);
//    }
//}
public class MenuTest {
    private Menu menu;
    @Before
    public void createMenu() {
        menu = new Menu();
    }

    @Test
    public void testMenu() {
        assertEquals(menu.size(), 1);
    }
}
