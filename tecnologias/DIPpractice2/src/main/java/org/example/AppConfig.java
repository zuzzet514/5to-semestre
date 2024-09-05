package org.example;

public class AppConfig {
    public static DocumentManager createDocumentManager() {
        FileCreatorRegistry registry = new FileCreatorRegistry();

        registry.registerCreator(1, new TxtFileCreator());
        registry.registerCreator(2, new DocxFileCreator());

        InputReader inputReader= new ConsoleInputReader(registry);
        return new DocumentManager(inputReader);
    }
}
