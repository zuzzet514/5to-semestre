public class Gato extends Animal {
    public Gato(String sonido) {
        super(sonido);
    }

    @Override
    public void hacerSonido() {
        System.out.println(this.getSonido() + "..." + this.getSonido());
    }

}
