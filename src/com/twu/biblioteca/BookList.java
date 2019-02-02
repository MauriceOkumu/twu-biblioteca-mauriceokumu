package com.twu.biblioteca;

import java.util.*;
public class BookList {
    public List <List<String>> list;

    public BookList() {
        this.list = new ArrayList<>(new ArrayList<>());
    }

    public void populate() {
        String[] a = new String[]{"Tom Blazi", "The Heightsing", "1967"};
        String[] b = new String[]{"Sidney Dr", "Luna Moon Diet", "1999"};
        String[] c = new String[]{"Igwe Root", "Exotic Birdsle", "2011"};
        String[] d = new String[]{"Alma Mase", "Beautiful Dogs", "2000"};
        String[] e = new String[]{"AUTHOR---", "BOOK TITLE----", "YEAR"};

        List<String> authorA = new ArrayList<>();
        List<String> authorB = new ArrayList<>();
        List<String> authorC = new ArrayList<>();
        List<String> authorD = new ArrayList<>();
        List<String> authorE = new ArrayList<>();

        authorA.addAll(Arrays.asList(e));
        authorB.addAll(Arrays.asList(a));
        authorC.addAll(Arrays.asList(b));
        authorD.addAll(Arrays.asList(c));
        authorE.addAll(Arrays.asList(d));

        list.add(authorA);
        list.add(authorB);
        list.add(authorC);
        list.add(authorD);
        list.add(authorE);
    }

    public String showList() {

        String visualizeTable = "";
        int counter = 0;

        for(int horizontal = 0; horizontal < list.size();horizontal++) {
            visualizeTable+=counter;
            counter++;
            for(int vertical = 0; vertical < list.get(0).size();vertical++) {
                visualizeTable += " | " + list.get(horizontal).get(vertical);
            }
            visualizeTable += " | \n";
        }


        return visualizeTable;


    }
}