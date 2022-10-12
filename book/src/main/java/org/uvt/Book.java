package org.uvt;

import java.util.ArrayList;

public class Book {
    String bookName = "";
    ArrayList<String> bookContent = new ArrayList<>();
    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void createNewParagraph(String paragraph){
        this.bookContent.add(paragraph);
    }

    public void createNewImage(String image){
        this.bookContent.add(image);
    }

    public void createNewTable(String table){
        this.bookContent.add(table);
    }

    public void printBook(){
        this.bookContent.forEach(System.out::println);
    }
}
