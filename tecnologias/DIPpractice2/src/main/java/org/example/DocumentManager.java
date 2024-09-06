package org.example;

import java.util.Scanner;

public class DocumentManager {
    private InputReader inputReader;
    Scanner scanner = new Scanner(System.in);

    public DocumentManager(InputReader inputReader) {
        this.inputReader = inputReader;
    }

    public void generateDocument() {
        System.out.println("Enter the content of the document: ");
        String content = scanner.nextLine();

        System.out.println("Enter the file name (without extension): ");
        String fileName = scanner.nextLine();

        FileCreator fileCreator = inputReader.getFileCreator();
        fileCreator.createFile(fileName, content);
        System.out.println("File created succesfully");
    }
}
