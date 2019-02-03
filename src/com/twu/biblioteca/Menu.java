package com.twu.biblioteca;

import java.util.*;
import java.math.*;
public class Menu {
    public List menu;
    public BookCheckout allBooks;
    public BookList bookLists ;
    public String userInput = "1",input,checkout;
    public Reader reader;
    public String optOut;

    public Menu() {
        this.menu = new ArrayList<>();
    }

    public void addToMenu() {
        menu.add("List of Books");
    }

    public void showMenu() {
//        allBooks = new BookCheckout();
//        allBooks.startProcess();
//        bookLists = allBooks.bookLists;

        System.out.println("___MENU___");
        System.out.println("1."+ menu.get(0)+"\n");
        reader = new Reader();
        setMenu("");
    }

    public void setMenu(String msg) {


        do{
             msg = "Please Select 1 from the menu above to see the list of books available! or quit to exit";
            System.out.print( msg );
            input = reader.scan();
            if(userInput.equals(input)) {
                System.out.println(bookLists.showList()+"\n");
            } else if(!input.equals(userInput) && !input.equals("yes")){
                System.out.println("Please select a valid option! Yes or 1");
            } else {
                optToQuit();
            }
        }
        while(!input.equals(userInput));


    }

    public void checkOUt () {
        System.out.print("Choose a number from above menu to checkout a book");
        checkout = reader.scan();
        int ind = Integer.parseInt(checkout);
        //System.out.println("This is a check  =>"+ bookLists.list.get(ind));
        //for( int i = 0; i < bookLists.list.size(); i++) {
            if(bookLists.list.size() > ind) {
                System.out.println("You successfully checked out a book by the title :"+ bookLists.list.get(ind).get(0));
                allBooks.showMessage();
                bookLists.list.remove(Integer.parseInt(checkout));
                System.out.println("These are the remaining books!");
                showMenu();

            } else {

              System.out.println("Sorry, that book is not available");
              System.out.println("Checkout the list again for available books");
              showMenu();
              checkOUt();

            }
        //}
        optToQuit();

    }

    public void optToQuit() {
        System.out.print("Do you wish to quit the Application? yes to quit or no to continue");
        optOut = reader.scan();
        if(optOut.equals("yes")) {
            System.exit(0);
        } else {
            System.out.println("Okay Here are the books we still have");
            showMenu();
        }

    }

    public void execute() {
        addToMenu();
        allBooks = new BookCheckout();
        allBooks.startProcess();
        bookLists = allBooks.bookLists;
        showMenu();
        checkOUt();

    }


}
