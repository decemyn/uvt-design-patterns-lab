package org.uvt.book.models;

import java.util.ArrayList;

public class Book extends Element {
    ArrayList<Author> authors = new ArrayList<>();

    public Book(String elementContent) {
        super(elementContent);
    }

    public String getBookName() {
        return super.getMasterElement();
    }

    public void setBookName(String bookName) {
        super.setMasterElement(bookName);
    }


    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void print() {
        System.out.printf("Book name: %s\n\n%n", this.getBookName());
        if (!authors.isEmpty()) {
            System.out.println("Authors:");
            authors.forEach(Author::print);
        }
        System.out.println("\n");
        super.print();
    }
}
