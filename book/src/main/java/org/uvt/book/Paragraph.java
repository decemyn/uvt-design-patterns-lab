package org.uvt.book;

public class Paragraph {
    private String text = "";

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println(String.format("Paragraph: %s",this.text));
    }
}