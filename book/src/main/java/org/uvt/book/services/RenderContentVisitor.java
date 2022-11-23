package org.uvt.book.services;

import org.uvt.book.models.*;

public final class RenderContentVisitor extends Visitor {

    public RenderContentVisitor(String visitorName) {
        super(visitorName);
    }

    @Override
    public void visitBook(Book book) {
        System.out.printf("Book name: %s\n\n%n", book.getBookName());
        if (!book.authors.isEmpty()) {
            System.out.println("Authors:");
            book.authors.forEach(Author::print);
        }
        System.out.println("\n");
    }

    @Override
    public void visitSection(Section section) {
        System.out.printf("Section: %s%n", section.getMasterElement());
    }

    @Override
    public void visitTable(Table table) {
        System.out.printf("Table: %s%n", table.getTitle());
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        System.out.printf("Visiting paragraph: %s%n", paragraph.getText());
    }

    @Override
    public void visitImage(Image image) {
        System.out.printf("Visiting image: %s%n", image.getImageName());
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        imageProxy.print();
    }
}
