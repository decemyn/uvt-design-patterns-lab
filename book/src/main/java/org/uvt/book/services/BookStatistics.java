package org.uvt.book.services;

import org.uvt.book.models.*;

public class BookStatistics extends Visitor {
    private int numberOfImages = 0;
    private int numberOfTables = 0;
    private int numberOfParagraphs = 0;


    public BookStatistics() {
        super("Book Statistics:");
    }

    @Override
    public void visitTable(Table table) {
        this.numberOfTables += 1;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        this.numberOfParagraphs += 1;
    }

    @Override
    public void visitImage(Image image) {
        this.numberOfImages += 1;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.numberOfImages += 1;
    }

    public void resetCounters(){
        this.numberOfImages = 0;
        this.numberOfTables = 0;
        this.numberOfParagraphs = 0;
    }

    public void printStatistics() {
        System.out.printf("*** Number of images: %s%n", this.numberOfImages);
        System.out.printf("*** Number of tables: %s%n", this.numberOfTables);
        System.out.printf("*** Number of paragraphs: %s%n", this.numberOfParagraphs);
    }
}
