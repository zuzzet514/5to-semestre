public abstract class Animal {
     private String sonido;

    public Animal(String sonido) {
        this.sonido = sonido;
    }

    public void comer() {
        System.out.println("*Comiendo... ñam ñam");
    }

    public void mimir() {
        System.out.println("Zzz");
    }

    public void morir() {
        System.out.println("*se muere*");
    }

    public abstract void hacerSonido();

    public String getSonido() {
        return sonido;
    }
}
