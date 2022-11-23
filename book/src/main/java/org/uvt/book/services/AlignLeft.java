package org.uvt.book.services;

import org.uvt.book.models.Paragraph;

public class AlignLeft implements IAlignStrategy {

    @Override
    public void render(Paragraph paragraph) {
        System.out.printf("%s ######################%n",paragraph.getText());
    }
}
