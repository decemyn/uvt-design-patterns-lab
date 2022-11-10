package org.uvt.book.models;

public interface IElement {

    String getMasterElement();

    void setMasterElement(String elementContent);

    Element getElement(int elementNumber);

    void addElement(Element element);

    void removeElement(Element element);

    void print();

    void accept(Visitor visitor);

}
