package org.uvt.book.models;

import java.util.ArrayList;

public abstract class Element implements IElement {
    private String elementContent = "";
    private final ArrayList<Element> childElements = new ArrayList<>();

    public Element(String elementContent) {
        this.elementContent = elementContent;
    }

    @Override
    public final String getMasterElement() {
        return this.elementContent;
    }

    @Override
    public final void setMasterElement(String elementContent) {
        this.elementContent = elementContent;
    }

    @Override
    public final Element getElement(int elementNumber) {
        return this.childElements.get(elementNumber);
    }

    @Override
    public final void addElement(Element element) {
        this.childElements.add(element);
    }

    @Override
    public final void removeElement(Element element) {
        this.childElements.remove(element);
    }

    @Override
    public void print() {
        System.out.println(this.elementContent);
        this.childElements.forEach(Element::print);
    }
}
