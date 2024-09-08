public class Main {
    public static void main(String[] args) {
        DocumentCreator documentCreator = AppConfig.generateDocumentCreator();
        documentCreator.generateDocument();
    }
}
