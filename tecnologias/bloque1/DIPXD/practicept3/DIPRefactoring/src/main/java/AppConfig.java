public class AppConfig {

    public static DocumentCreator createDocumentCreator() {
        String [] fileTypes = {"Txt", "Docx"};

        FileCreatorRegistry registry = new FileCreatorRegistry();
        registry.registerCreators(1, new TxtFileCreator(), fileTypes[0]);
        registry.registerCreators(2, new DocxFileCreator(), fileTypes[1]);

        InputReader inputReader = new ConsoleReaderInput();
        return new DocumentCreator(inputReader, registry);
    }
}
