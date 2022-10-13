package org.uvt.book;

public abstract class Element implements IElement{
    private String elementContent = "";

    public Element(String elementContent) {
        this.elementContent = elementContent;
    }

    @Override
    public String getElementContent() {
        return this.elementContent;
    }

    @Override
    public void addElementContent(String elementContent) {
        this.elementContent = elementContent;
    }

    public void print(){
        System.out.println(this.elementContent);
    }
}
