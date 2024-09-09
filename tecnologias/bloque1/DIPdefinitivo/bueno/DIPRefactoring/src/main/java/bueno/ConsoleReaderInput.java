package bueno;

import java.util.Scanner;

public class ConsoleReaderInput implements InputReader {
    private final Scanner SCANNER = new Scanner(System.in);
    //message (el mensaje que se desea imprimir)
    // retorna lo ingresado por el usuario
    @Override
    public String readInput(String message) {
        System.out.println(message);
        return SCANNER.nextLine();
    }
}











