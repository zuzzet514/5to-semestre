public class Triangle {

    public static void triangleType(int a, int b, int c) {
        if (areAllSWithinRange(a, b, c) && areAllS(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("Equilátero");
            } else if ((a==b) || (b==c) || (a==c)) {
                System.out.println("Isósceles");
            } else {
                System.out.println("Escaleno");
            }
        }
    }

    static boolean isWhithinRange(int number) {
        return number >= 1 && number <= 200;
    }

    static boolean isSumGreaterThan(int a, int b, int c) {
        return a < b + c;
    }

    static String notWithinRangeMessage(int number) {
        return "El valor " + number + " no está dentro del rango permitido";
    }

    static boolean areAllSWithinRange(int a, int b, int c) {
        int [] sides = {a, b, c};
        boolean flag = true;

        for (int i: sides) {
            if (!isWhithinRange(i)) {
                flag = false;
                System.out.println(notWithinRangeMessage(i));
            }
        }
        return flag;
    }

    // checa condiciones c4, c5, c6
    static boolean areAllS(int a, int b, int c) {
        int [] sides = {a, b, c};
        boolean flag = true;

        if (!isSumGreaterThan(a, b, c) || !isSumGreaterThan(b, a, c) || !isSumGreaterThan(c, a, b)) {
            flag = false;
            System.out.println("No es un triángulo");
        }
        return flag;
    }

    public static void main(String[] args) {
        triangleType(1, 50, 75);
        triangleType(2, 3, 1);
        triangleType(330, 50, 72);
        triangleType(50, 50, 73);
        triangleType(4,4,4);
        triangleType(5,6,10);
    } // fin del main

} // fin de la clase
