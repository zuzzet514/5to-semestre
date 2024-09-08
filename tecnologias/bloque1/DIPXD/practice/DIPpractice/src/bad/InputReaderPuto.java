package bad;

import java.util.Scanner;

public class InputReaderPuto {
    Scanner scanner = new Scanner(System.in);

    public String getContent() {
        System.out.println("Enter the content of the document: ");
        String content = scanner.nextLine();
        return content;
    }

    public String getFileName() {
        System.out.println("Enter the file name (without extension): ");
        String fileName = scanner.nextLine();
        return fileName;
    }

}
