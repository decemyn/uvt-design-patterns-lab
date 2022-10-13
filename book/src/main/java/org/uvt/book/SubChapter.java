package org.uvt.book;

import java.util.ArrayList;

public class SubChapter {
    private String name = "";
    private ArrayList<Element> subChapterElements = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createNewParagraph(String paragraph) {
        this.subChapterElements.add(new Paragraph(paragraph));
    }

    public void createNewImage(String image) {
        this.subChapterElements.add(new Image(image));
    }

    public void createNewTable(String table) {
        this.subChapterElements.add(new Table(table));
    }

    public void print() {
        System.out.println(String.format("Subchapter %s", this.name));
        this.subChapterElements.forEach(Element::print);
    }
}
