package org.uvt.book;

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
        System.out.println(String.format("Book name: %s\n\n", this.getBookName()));
        System.out.println("Authors:");
        authors.forEach(Author::print);
        System.out.println("\n");
        super.print();
    }
}
