import java.util.Scanner;

public class InputReader {

    Scanner scanner = new Scanner(System.in);

    public String getContent() {
        System.out.println("Ingresa el contenido de tu documento:");
        String content = scanner.nextLine();

        return content;
    }

    public String getFileName() {
        System.out.println("Ingresa el nombre del archivo (sin la extensión):");
        String fileName = scanner.nextLine();

        return fileName;
    }
}
