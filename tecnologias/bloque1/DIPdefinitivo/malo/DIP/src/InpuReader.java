import java.util.Scanner;

public class InpuReader {
    Scanner scanner = new Scanner(System.in);

    public String getContent() {
        System.out.println("Ingresa el contenido de tu archivo Txt:");
        return scanner.nextLine();
    }

    public String getFileName() {
        System.out.println("Ingresa el nombre del archivo (sin extensión):");
        return scanner.nextLine();
    }
}


















