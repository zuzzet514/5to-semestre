public class DocumentCreator {

    private InputReader inputReader;
    private FileCreatorRegistry registry;

    public DocumentCreator(InputReader inputReader, FileCreatorRegistry registry) {
        this.inputReader = inputReader;
        this.registry = registry;
    }

    public void generateDocument() {

        String content = inputReader.readInput("Enter the content of the document:");

        String fileName = inputReader.readInput("Enter the file name(without extension):");

        String fileType = inputReader.readInput("Choose the file type to create:" + registry.showOptions());
        int choice = Integer.parseInt(fileType);

        FileCreator fileCreator = registry.getCreator(choice);

        fileCreator.createFile(content, fileName);
        System.out.println("File created successfully");


    }
}
