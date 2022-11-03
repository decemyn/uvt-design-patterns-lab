package org.uvt.book;

public class AlignLeft implements IAlignStrategy{

    @Override
    public void render(Paragraph paragraph) {
        System.out.printf("%s ######################%n",paragraph.getText());
    }
}
