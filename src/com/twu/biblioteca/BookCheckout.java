package com.twu.biblioteca;



public class BookCheckout {
    private String preparedBook;
    public BookList bookLists;


    public void setPreparedBook(String preparedBook) {
        this.preparedBook = preparedBook;
    }

    public String getPreparedBook() {
        return preparedBook;
    }


    //@Override
    public void returnBook(BookList lib, String book) {

    }

    //@Override
    public void showMessage() {
       System.out.println("Thank you Enjoy the Book!");
    }

    public void startProcess() {
        bookLists = new BookList();
        bookLists.populate();
    }


}
