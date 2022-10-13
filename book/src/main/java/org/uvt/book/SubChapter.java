package org.uvt.book;

import java.util.ArrayList;

public class SubChapter {
    private String name = "";
    private ArrayList<Paragraph> paragraphs = new ArrayList<>();
    private ArrayList<Image> images = new ArrayList<>();
    private ArrayList<Table> tables = new ArrayList<>();

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
        this.paragraphs.add(new Paragraph(paragraph));
    }

    public void createNewImage(String image) {
        this.images.add(new Image(image));
    }

    public void createNewTable(String table) {
        this.tables.add(new Table(table));
    }

    public void print() {
        System.out.println(String.format("Subchapter %s", this.name));
        this.paragraphs.forEach(Paragraph::print);
        this.images.forEach(Image::print);
        this.tables.forEach(Table::print);
    }
}
