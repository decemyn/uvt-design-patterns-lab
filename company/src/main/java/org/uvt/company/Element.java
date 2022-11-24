package org.uvt.company;

import java.util.ArrayList;

public class Element implements IElement {
    String masterElementContent = "";
    protected final ArrayList<Element> childElements = new ArrayList<>();

    public Element(String masterElementContent) {
        this.masterElementContent = masterElementContent;
    }

    @Override
    public final void setMasterContent(String masterContent) {
        this.masterElementContent = masterContent;
    }

    @Override
    public final String getMasterContent() {
        return this.masterElementContent;
    }

    @Override
    public void add(Element element) {
        this.childElements.add(element);
    }

    @Override
    public final Element get(int childElementIndex) {
        return this.childElements.get(childElementIndex);
    }

    @Override
    public void print() {
        System.out.println(this.getMasterContent());
        System.out.println();
    }

    @Override
    public void accept(IVisitor visitor) {
        this.childElements.forEach(elemnt -> elemnt.accept(visitor));
    }
}
