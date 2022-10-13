package org.uvt.book;

public class Image extends Element {

    public Image(String imageName) {
        super(imageName);
    }

    public String getImageName() {
        return super.getElementContent();
    }

    public void setImageName(String imageName) {
        super.addElementContent(imageName);
    }

    public void print() {
        System.out.print("Image: ");
        super.print();
    }
}