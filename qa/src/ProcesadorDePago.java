public class ProcesadorDePago {
    public void procesar(Pago pago) {
        pago.procesarPago();

        if (pago instanceof TarjetaCredito) {
            TarjetaCredito tarjeta = (TarjetaCredito) pago;
            tarjeta.verficarLimiteCredito();
        } else if (pago instanceof Paypal) {
            Paypal paypal = (Paypal) pago;
            paypal.enviarRecibo();
        }
    }
}
