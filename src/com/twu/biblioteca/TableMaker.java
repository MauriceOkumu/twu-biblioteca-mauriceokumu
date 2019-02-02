package com.twu.biblioteca;

public class TableMaker {
    private int rows;
    private int columns;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }


    public TableMaker() {

    }

    public  String makeTable() {

        String[][] table = new String[columns][rows];
        String visualizeTable = "";

        for(int horizontal = 0; horizontal < table.length;horizontal++) {
            for(int vertical = 0; vertical < table[0].length;vertical++) {
                visualizeTable += " | " + table[horizontal][vertical];
            }
            visualizeTable += " | \n";
        }
        return visualizeTable;
    }

    public static void  main(String[] args) {
        System.out.println("The making of the table");
        TableMaker showTable = new TableMaker();
        showTable.setRows(3);
        showTable.setColumns(8);
        System.out.println(showTable.makeTable());
    }
}
