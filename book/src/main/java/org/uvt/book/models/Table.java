package org.uvt.book.models;

public final class Table extends Element {
    private String title = "";

    public Table(String title) {
        super(title);
    }

    public String getTitle() {
        return super.getMasterElement();
    }

    public void setTitle(String title) {
        super.setMasterElement(title);
    }

    public void print() {
        System.out.println(String.format("Table: %s", this.getTitle()));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
        super.accept(visitor);
    }
}
