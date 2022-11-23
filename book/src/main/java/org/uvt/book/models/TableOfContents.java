package org.uvt.book.models;

public class TableOfContents extends Element {
    private String toc = "";

    public TableOfContents(String toc) {
        super(toc);
    }

    public String getToc() {
        return super.getMasterElement();
    }

    public void setToc(String toc) {
        super.setMasterElement(toc);
    }

    public void print() {
        System.out.printf("Table of Contents: %s%n", this.getToc());
    }
}
