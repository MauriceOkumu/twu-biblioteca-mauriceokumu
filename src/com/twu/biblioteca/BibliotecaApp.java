package com.twu.biblioteca;


public class BibliotecaApp {

    public static void main(String[] args) {

        BookList bookLists = new BookList();

        System.out.println("Welcome to Biblioteca.Your one-stop shop for great books in Bangalore!");
        bookLists.populate();
        System.out.println("These are some of the books in our collection.");
        System.out.println(bookLists.viewList());
        System.out.println(bookLists.showList());

    }
}
