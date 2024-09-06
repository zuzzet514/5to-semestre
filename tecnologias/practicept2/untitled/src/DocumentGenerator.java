public class DocumentGenerator {
    private TxtFileCreator txt = new TxtFileCreator();
    private InputReader reader = new InputReader();

    public void makeTxtFile() {
        String content = this.reader.getContent();
        String fileName = this.reader.getFileName();

        this.txt.createFile(content,fileName);

        System.out.println("Archivo creado satisfactoriamente");
    }

    public void makeDocxFile() {

    }
}
