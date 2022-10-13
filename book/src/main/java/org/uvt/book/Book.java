package org.uvt.book;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Book {
    private String bookName = "";
    ArrayList<Chapter> chapters = new ArrayList<>();
    ArrayList<Author> authors = new ArrayList<>();

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int createChapter(String chapterName) {
        this.chapters.add(new Chapter(chapterName));
        return this.chapters.size() - 1;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public Chapter getChapter(int chapterIndex){
        return this.chapters.get(chapterIndex);
    }

    public void print() {
        System.out.println(String.format("Book name: %s",this.bookName));
        ArrayList<String> authorNameList = new ArrayList<>();
        this.authors.forEach(author -> {
            authorNameList.add(author.getName());
        });
        System.out.println(String.format("Authors: %s", authorNameList));
        this.chapters.forEach(Chapter::print);
    }
}
