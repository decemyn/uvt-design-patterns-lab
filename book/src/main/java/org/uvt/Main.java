package org.uvt;

import org.uvt.book.Author;
import org.uvt.book.Book;
import org.uvt.book.Chapter;
import org.uvt.book.SubChapter;

public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author rpGheo = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(rpGheo);
        int indexChOne = discoTitanic.createChapter("Capitolul 1");
        Chapter chapterOne = discoTitanic.getChapter(indexChOne);
        int indecSubChOne = chapterOne.createSubChapter("Subcapitolul 1.1");
        SubChapter subChapterOneOne = chapterOne.getSubChapter(indecSubChOne);
        subChapterOneOne.createNewParagraph("Paragraph 1");
        subChapterOneOne.createNewParagraph("Paragraph 2");
        subChapterOneOne.createNewParagraph("Paragraph 3");
        subChapterOneOne.createNewTable("Table 1");
        subChapterOneOne.createNewParagraph("Paragraph 4");
        subChapterOneOne.createNewTable("Table 2");
        subChapterOneOne.createNewImage("Image 1");
        System.out.println("\nEntire book print\n");
        discoTitanic.print();
        System.out.println("\nSubChapter only print\n");
        subChapterOneOne.print();
        System.out.println("\nEntire chapter print\n");
        chapterOne.print();
    }
}