package com.twu.biblioteca;

import java.util.*;
import java.math.*;
public class Menu {
    public List menu;
    public BookList bookLists ;

    public Menu() {
        this.menu = new ArrayList<>();
    }

    public void addToMenu(String item) {
        menu.add(item);
    }

    public void showMenu() {
        bookLists = new BookList();
        bookLists.populate();

        System.out.println("___MENU___");
        System.out.println("1."+ menu.get(0)+"\n");
        Scanner inputs = new Scanner(System.in);
        System.out.print("Select 1 to look at our book collection ");

        if(inputs.nextLine() .equals("1")) {
            System.out.println(bookLists.showList()+"\n");
        }
        inputs.close();

    }
}
