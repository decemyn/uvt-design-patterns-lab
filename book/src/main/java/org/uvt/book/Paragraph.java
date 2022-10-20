package org.uvt.book;

final public class Paragraph extends Element {

    public Paragraph(String text) {
        super(text);
    }

    public String getText() {
        return super.getMasterElement();
    }

    public void setText(String text) {
        super.setMasterElement(text);
    }

    public void print() {
        System.out.println(String.format("Paragraph: %s", this.getText()));
    }
}