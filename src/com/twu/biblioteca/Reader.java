package com.twu.biblioteca;

import java.util.Scanner;
public class Reader {
    Scanner scanner ;

    public Reader() {
        scanner = new Scanner(System.in);
    }

    public String scan() {
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
        } else {
            input = "ERROR scanning the input";
        }
        return input.toLowerCase();
    }

    public void close(){
        scanner.close();
    }
}
