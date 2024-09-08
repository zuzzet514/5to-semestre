package bad;

public class DocumentManager {

    private TxtFileCreator txt = new TxtFileCreator();
    private InputReaderPuto reader = new InputReaderPuto();



    public void makeFile() {
        String content = reader.getContent();
        String fileName = reader.getFileName();

        this.txt.createFile(content, fileName);

        System.out.println("File created succesfully!");

    }
}
