package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        BookList bookLists = new BookList();

        System.out.println("Welcome to Biblioteca.Your one-stop shop for great books in Bangalore!");
        bookLists.populate();
        System.out.println("These are some of the books in our collection.");
        bookLists.showList();
    }
}
