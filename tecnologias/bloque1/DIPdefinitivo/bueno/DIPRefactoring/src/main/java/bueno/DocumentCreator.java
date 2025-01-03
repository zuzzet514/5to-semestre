package bueno;

public class DocumentCreator {
    private InputReader inputReader;
    private FileCreatorRegistry registry;

    // dependency injection a través del constructor
    public DocumentCreator(InputReader inputReader, FileCreatorRegistry registry) {
        this.inputReader = inputReader;
        this.registry = registry;
    }

    // se utiliza una abstracción para leer lo que ingrese el usuario
    public void generateDocument() {
        String content = inputReader.readInput("Ingresa el contenido de tu archivo:");

        String fileName = inputReader.readInput("Ingresa el nombre de tu archivo(sin extensión):");

        String fileType = inputReader.readInput("Escoge el tipo de archivo: " + registry.showOptions());
        int choice = Integer.parseInt(fileType);

        FileCreator fileCreator = registry.getCreator(choice);

        fileCreator.createFile(content, fileName);
        System.out.println("Archivo creado exitosamente");


    }








}
