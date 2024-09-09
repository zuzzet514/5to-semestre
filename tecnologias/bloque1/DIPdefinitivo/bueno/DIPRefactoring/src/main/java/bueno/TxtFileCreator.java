package bueno;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileCreator implements FileCreator { // módulo de bajo nivel
    private static String type = "txt";

    public static String getType() {
        return type;
    }

   // escribe el archivo txt
    @Override
    public void createFile(String content, String fileName) {
        try (
                BufferedWriter writer = new BufferedWriter
                        ( new FileWriter(fileName + ".txt") )
        ) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}














