package org.uvt.book.models;

public interface IVisitor {

    void visitBook(Book book);

    void visitSection(Section section);

    void visitTable(Table table);

    void visitParagraph(Paragraph paragraph);

    void visitImage(Image image);

    void visitImageProxy(ImageProxy imageProxy);

}
