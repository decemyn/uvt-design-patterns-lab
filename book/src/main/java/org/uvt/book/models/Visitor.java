package org.uvt.book.models;

public abstract class Visitor implements IVisitor {
    public String visitorName = "";

    public Visitor(String visitorName) {
        this.visitorName = visitorName;
        System.out.println(visitorName);
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    @Override
    public void visitBook(Book book) {
        System.out.printf("Visiting book: %s%n", book.getBookName());
    }

    @Override
    public void visitSection(Section section) {
        System.out.printf("Visiting section: %s%n", section.getMasterElement());
    }

    @Override
    public void visitTable(Table table) {
        System.out.printf("Visiting table: %s%n", table.getTitle());
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
        imageProxy.loadImage();
        System.out.printf("Visiting image: %s%n", imageProxy.realImage.getImageName());
    }
}
