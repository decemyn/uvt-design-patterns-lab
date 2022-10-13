package org.uvt.book;

public class Table extends Element {
    private String title = "";

    public Table(String title) {
        super(title);
    }

    public String getTitle() {
        return super.getElementContent();
    }

    public void setTitle(String title) {
        super.addElementContent(title);
    }

    public void print() {
        System.out.print("Table: ");
        super.print();
    }
}
