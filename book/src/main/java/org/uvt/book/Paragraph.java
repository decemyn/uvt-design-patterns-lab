package org.uvt.book;

final public class Paragraph extends Element {

    public Paragraph(String text) {
        super(text);
    }

    public String getText() {
        return super.getElementContent();
    }

    public void setText(String text) {
        super.addElementContent(text);
    }

    public void print() {
        System.out.print("Paragraph: ");
        super.print();
    }
}