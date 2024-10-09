import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {
    Scanner sc = new Scanner(System.in);

    // altura en cm
    public static double calcularIMC(double peso, double altura) {
        DecimalFormat df = new DecimalFormat("0.00");

        // el peso y la altura deben de ser mayores a 0 y menor a los límites del cuerpo humano
        if (altura > 0 && peso > 0 && altura <= 300 && peso <= 600) {
            double alturaEnMetros = altura/100;
            return Double.parseDouble(df.format(peso/Math.pow(alturaEnMetros,2)))  ;
        } else {
            throw new ArithmeticException();
        }

    }



}
