package org.uvt.book;

public class Table {
    private String title = "";

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println(String.format("Table: %s",this.title));
    }
}
