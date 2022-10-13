package org.uvt.book;

import java.util.ArrayList;

public class Chapter {
    private String name = "";
    private ArrayList<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int createSubChapter(String subChapterName) {
        this.subChapters.add(new SubChapter(subChapterName));
        return this.subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int subChapterIndex){
        return this.subChapters.get(subChapterIndex);
    }

    public void print(){
        System.out.println(String.format("Chapter: %s", this.name));
        this.subChapters.forEach(SubChapter::print);
    }
}
