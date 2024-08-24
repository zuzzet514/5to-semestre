public abstract class Pago {
    public abstract void procesarPago();

}

class TarjetaCredito extends Pago {
    private String numeroTarjeta;
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaCredito(String numeroTarjeta, String fechaExpiracion, String codigoSeguridad) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta de crédito");
    }

    public void verficarLimiteCredito() {
        System.out.println("Verficando límite de crédito");
    }
}

class Paypal extends Pago {
    private String emailUsuario;

    public Paypal(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con paypal");
    }

    public void enviarRecibo() {
        System.out.println("Enviando recibo");
    }

}
