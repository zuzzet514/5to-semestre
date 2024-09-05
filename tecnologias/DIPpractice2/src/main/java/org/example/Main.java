package org.example;

public class Main {
    public static void main(String[] args) {
        DocumentManager documentManager = AppConfig.createDocumentManager();
        documentManager.generateDocument();
    }
}