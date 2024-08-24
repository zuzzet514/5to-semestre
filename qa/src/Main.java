public class Main {
    public static void main(String[] args) {
        ProcesadorDePago procesador = new ProcesadorDePago();

        Pago pagoConTarjeta = new TarjetaCredito("123-5678-9012", "12/25", "123");
        Pago pagoConPaypal = new Paypal("zuzzet.hs14@gmail.com");

        procesador.procesar(pagoConTarjeta); // se realiza el downcasting a TarjetaCredito
        procesador.procesar(pagoConPaypal); // Se realiza el downcasting a Paypal
    }
}