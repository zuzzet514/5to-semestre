public class Temperatura {

    public static String promedioTemperatura(int temp1, int temp2, int temp3) {

        int [] temps = {temp1, temp2, temp3};

        for (int i : temps) {
            if (i > 45 || i < 30) {
                return "EL VALOR " + i + " NO ES CORRECTO";
            }
        }

        double promedio = (double) (temp1 + temp2 + temp3) / 3;

        if (promedio < 36.5) {
            return "HIPOTERMIA";
        }

        if (promedio >= 36.5 && promedio <=37.4) {
            return "NORMAL";
        }

        if (promedio >= 37.5 && promedio <=39.9) {
            return "HIPERTERMIA";
        }

        return "HIPERPIREXIA";

    }

}
