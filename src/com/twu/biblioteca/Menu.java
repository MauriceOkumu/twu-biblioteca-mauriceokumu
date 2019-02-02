package com.twu.biblioteca;

import java.util.*;
import java.math.*;
public class Menu {
    public List menu;
    public BookList bookLists ;
    public String userInput = "1",input;

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


        do{
            String msg = "Please Select an option from the above menu!";
            System.out.print( msg );
            input = inputs.nextLine();
            if(userInput.equals(input)) {
                System.out.println(bookLists.showList()+"\n");
            } else {
                System.out.println("Please select a valid option!");
            }
        }
        while(!input.equals(userInput));

        inputs.close();

    }
}
