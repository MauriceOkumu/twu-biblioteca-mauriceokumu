package com.twu.biblioteca;

import java.util.*;
public class BookList {
    public ArrayList list;

    public  BookList(ArrayList bookList) {
        this.list = bookList;
    }

    public void populate() {
        list.add("Armageddon");
        list.add("Counterfeiters");
        list.add("The Nest");
    }

}
