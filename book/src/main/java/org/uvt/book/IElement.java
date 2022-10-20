package org.uvt.book;

public interface IElement {

    public String getMasterElement();

    public void setMasterElement(String elementContent);

    public Element getElement(int elementNumber);

    public void addElement(Element element);

    public void removeElement(Element element);

    public void print();
}
