package org.uvt.book.models;

import java.util.concurrent.TimeUnit;

public final class Image extends Element implements IPicture {
    String url;
    int dim;
    String content;


    // Mock image metadata in constructor
    public Image(String imageName, String url, int dim, String content) {
        super(imageName);
        this.url = url;
        this.dim = dim;
        this.content = content;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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

    // Extra image metadata (mock for now)

    @Override
    public String url() {
        return this.url;
    }

    @Override
    public int dim() {
        return this.dim;
    }

    @Override
    public String content() {
        return this.content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
        super.accept(visitor);
    }
}