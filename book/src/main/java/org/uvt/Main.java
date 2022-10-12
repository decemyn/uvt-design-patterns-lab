package org.uvt;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("TestBook");
        myBook.createNewParagraph("Paragraph 1");
        myBook.createNewParagraph("Paragraph 2");
        myBook.createNewImage("Image 1");
        myBook.createNewParagraph("Paragraph 3");
        myBook.createNewTable("Table 1");
        myBook.printBook();
    }
}