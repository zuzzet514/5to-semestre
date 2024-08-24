public class Logger {
    public void log(String... messages) { // internamente arreglo de cadena
        System.out.println("Múltiples mensajes:");

        for (String message : messages) {
            System.out.println(message);
        }
    }

    public <T> void log(T message) {
        System.out.println("Mensaje genérico: " + message);
    }

    public void log(int level, String... message) {
        System.out.println("Múltiples mensajes: con niveles: " + level);
    }

    public static void main(String[] args) {
        Logger logger = new Logger();
        Logger logger2 = new Logger();
        Logger logger3 = new Logger();
        Logger logger4 = new Logger();

        logger.log("HOLA");
        logger2.log("AAA");
        logger3.log(4);
        logger4.log(true);


    }
}
