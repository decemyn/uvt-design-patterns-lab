package org.uvt.book.services;

import org.uvt.book.models.Paragraph;

public class AlignCenter implements IAlignStrategy {

    @Override
    public void render(Paragraph paragraph) {
        System.out.printf("########### %s ###########%n", paragraph.getText());
    }
}

