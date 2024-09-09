package bueno;

public class AppConfig {
    public static DocumentCreator generateDocumentCreator() {

        FileCreatorRegistry registry = new FileCreatorRegistry();
        registry.registerCreators(1, new TxtFileCreator(), TxtFileCreator.getType());
        registry.registerCreators(2, new DocxFileCreator(), DocxFileCreator.getType());


        InputReader inputReader = new ConsoleReaderInput();
        return new DocumentCreator(inputReader,registry);
    }
}
