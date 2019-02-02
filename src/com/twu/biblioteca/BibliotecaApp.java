package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        BookList bookLists = new BookList();
        Menu showOtions = new Menu();
        showOtions.addToMenu("List of Books");
        System.out.println("Welcome to Biblioteca.Your one-stop shop for great books in Bangalore!");
        bookLists.populate();
        showOtions.showMenu();

    }
}
