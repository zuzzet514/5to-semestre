public class Calculadora {
    public static double PI = 3.14159265358979323846;

    public static void sumar(int num1, int num2) {
        int resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }

    public static void sumar(int num1, int num2, int num3) {
        int resultado = num1 + num2 + num3;
        System.out.println("Resultado: " + resultado);
    }

    public static double sumar(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
}
