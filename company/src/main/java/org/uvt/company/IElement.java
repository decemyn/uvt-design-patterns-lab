package org.uvt.company;

public interface IElement {

    void setMasterContent(String masterContent);

    String getMasterContent();

    void add(Element element);

    Element get(int childElementIndex);

    void print();

    void accept(IVisitor visitor);
}
