package org.uvt.book.models;

import org.uvt.book.models.Element;

public interface IElement {

    public String getMasterElement();

    public void setMasterElement(String elementContent);

    public Element getElement(int elementNumber);

    public void addElement(Element element);

    public void removeElement(Element element);

    public void print();
}
