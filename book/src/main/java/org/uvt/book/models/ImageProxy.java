package org.uvt.book.models;

public final class ImageProxy extends Element implements IPicture {
    Image realImage = null;
    String url;
    int dim;
    String content;

    public ImageProxy(String imageName) {
        super(imageName);
        this.url = imageName;
        this.dim = this.url.length();
        this.content = imageName;
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
    public void print() {
        this.loadImage();
        this.realImage.print();
    }

    public void loadImage() {
        this.realImage = new Image(this.getMasterElement(), this.url, this.dim, this.content);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
        super.accept(visitor);
    }
}
