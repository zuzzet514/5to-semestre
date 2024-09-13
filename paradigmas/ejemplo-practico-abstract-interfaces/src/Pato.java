public class Pato extends Animal implements AnimalVolador {

    public Pato(String sonido) {
        super(sonido);
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.getSonido() + " " + this.getSonido() + " " + this.getSonido());
    }

    @Override
    public void volar() {
        System.out.println("Está volando 5000m");
    }

    @Override
    public void aterrizar() {
        System.out.println("Ha aterrizado");
    }
}
