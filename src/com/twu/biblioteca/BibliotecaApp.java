package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<String> listOfBooks = new ArrayList<>();
        BookList bookLists = new BookList(listOfBooks);

        System.out.println("Welcome to Biblioteca.Your one-stop shop for great books in Bangalore!");
        bookLists.populate();
        System.out.println("Booklist is populated "+ bookLists.list.get(1));
    }
}
