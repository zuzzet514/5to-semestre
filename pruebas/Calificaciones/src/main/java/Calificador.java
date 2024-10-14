import java.text.DecimalFormat;

public class Calificador {

    public static double calcularCalificacionFinal(double examen1, double examen2, double examen3) {
        boolean dentroDelRango = (examen1 >= 0 && examen1 <=10) && (examen2 >= 0 && examen2 <=10)
                && (examen3 >= 0 && examen3 <=10);

        DecimalFormat df = new DecimalFormat("#.##");

        if (dentroDelRango) {
            double result = (examen1 + examen2 + examen3)/3.0;
            String resultadoFormateado = df.format(result);
            double calificacionFinal = Double.parseDouble(resultadoFormateado);

            return calificacionFinal;

        }  else {
            throw new ArithmeticException();
        }

    }
}
