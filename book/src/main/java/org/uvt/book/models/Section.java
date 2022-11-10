package org.uvt.book.models;

public final class Section extends Element {

    public Section(String elementContent) {
        super(elementContent);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
        super.accept(visitor);
    }
}
