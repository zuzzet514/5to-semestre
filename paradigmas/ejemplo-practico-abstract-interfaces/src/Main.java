public class Main {
    public static void main(String[] args) {
        Animal gato = new Gato("Miau");
        Pato pato = new Pato("Cuack");

        gato.hacerSonido();
        gato.comer();
        gato.morir();

        pato.hacerSonido();
        pato.volar();
        pato.aterrizar();
        pato.morir();
    }
}