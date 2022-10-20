package org.uvt.book;

public class Image extends Element {

    public Image(String imageName) {
        super(imageName);
    }

    public String getImageName() {
        return super.getMasterElement();
    }

    public void setImageName(String imageName) {
        super.setMasterElement(imageName);
    }

    public void print() {
        System.out.println(String.format("Image: %s", this.getImageName()));
    }
}