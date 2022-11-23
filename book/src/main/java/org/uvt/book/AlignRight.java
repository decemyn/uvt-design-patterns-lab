package org.uvt.book;

public class AlignRight implements IAlignStrategy{

    @Override
    public void render(Paragraph paragraph) {
        System.out.printf("###################### %s%n",paragraph.getText());
    }
}
