package com.twu.biblioteca;


import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class TableMakerTest {
    private TableMaker tableMaker;

    @Before
    public void createTableTest() throws Exception {
        tableMaker =  new TableMaker();
        tableMaker.setRows(3);
        tableMaker.setColumns(6);
    }
    @Test
    public  void makeTableTest() {
        assertEquals(tableMaker.getRows(), 3);
        assertEquals(tableMaker.getColumns(), 6);
    }
}
