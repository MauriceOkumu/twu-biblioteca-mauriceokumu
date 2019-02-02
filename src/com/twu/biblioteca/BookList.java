package com.twu.biblioteca;

import java.util.*;
public class BookList {
    public ArrayList list;

    public BookList() {
        this.list = new ArrayList<>();
    }

    public void populate() {
        list.add("Armageddon");
        list.add("Counterfeiters");
        list.add("The Nest");
    }

    public Boolean showList() {
//        Iterator iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        int count = 0;
        while (list.size() > count) {
            System.out.println(count+1 +". "+list.get(count));
            count++;

        }
        return true;

    }
}