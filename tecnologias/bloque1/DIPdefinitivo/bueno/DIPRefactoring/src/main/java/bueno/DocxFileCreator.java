package bueno;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.FileOutputStream;
import java.io.IOException;

public class DocxFileCreator implements FileCreator {
    private static String type = "docx";

    public static String getType() {
        return type;
    }

    @Override
    public void createFile(String content, String fileName) {
        try (
                XWPFDocument document = new XWPFDocument();
                FileOutputStream out = new FileOutputStream(fileName + ".docx")
                ) {
                document.createParagraph().createRun().setText(content);
                document.write(out);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}















