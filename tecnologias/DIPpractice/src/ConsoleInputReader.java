import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    private final FileCreator registry;

    public ConsoleInputReader(FileCreator registry) {
        this.registry = registry;
    }

    @Override
    public FileCreator getFileCreator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the file type to create (1: txt, 2:docx):");
        int choice = scanner.nextInt();
        scanner.nextLine();

        FileCreator creator = registry.getCreator(choice);

        if (creator == null) {
            throw new IllegalArgumentException("Invalid file type selected");
        }

        return creator;
    }
}
