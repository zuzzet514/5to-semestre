package org.example;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileOutputStream;
import java.io.IOException;

public class DocxFileCreator implements FileCreator {
    @Override
    public void createFile(String fileName, String content) {
        try (XWPFDocument document = new XWPFDocument();
             FileOutputStream out = new FileOutputStream(fileName + ".docx")) {
            document.createParagraph().createRun().setText(content);
            document.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
