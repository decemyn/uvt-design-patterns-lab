package org.uvt.book.models;

import java.util.ArrayList;

public final class Book extends Element {
    public ArrayList<Author> authors = new ArrayList<>();

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

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);
        super.accept(visitor);
    }
}
