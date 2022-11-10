package org.uvt.book.models;

import org.uvt.book.services.IAlignStrategy;

public final class Paragraph extends Element {
    IAlignStrategy alignStrategy = null;

    public Paragraph(String text) {
        super(text);
    }

    public String getText() {
        return super.getMasterElement();
    }

    public void setText(String text) {
        super.setMasterElement(text);
    }

    public void setAlignStrategy(IAlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    public void print() {
        if (this.alignStrategy == null) {
            System.out.printf("Paragraph: %s%n", this.getText());
        } else {
            this.alignStrategy.render(this);
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
        super.accept(visitor);
    }
}