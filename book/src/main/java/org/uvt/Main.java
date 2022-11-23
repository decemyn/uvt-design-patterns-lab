package org.uvt;

import org.uvt.book.models.*;
import org.uvt.book.services.RenderContentVisitor;

public class Main {
    public static void main(String[] args) throws Exception {
        Book testBook= new Book("Test Book");
        TableOfContents toc = new TableOfContents("Table of Contents");
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.addElement(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.addElement(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.addElement(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.addElement(p4);
        cap1.addElement(new ImageProxy("ImageOne"));
        cap1.addElement(new ImageProxy("ImageTwo"));
        cap1.addElement(new Paragraph("Some text"));
        cap1.addElement(new Table("Table 1"));
        testBook.addElement(toc);
        testBook.addElement(cap1);
        RenderContentVisitor renderContentVisitor = new RenderContentVisitor("Book render visitor");
        testBook.accept(renderContentVisitor);
//        BookStatistics stats = new BookStatistics();
//        cap1.accept(stats);
//        stats.printStatistics();
    }
}