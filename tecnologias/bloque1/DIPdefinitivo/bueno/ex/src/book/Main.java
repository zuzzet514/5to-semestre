package book;

public class Main {

    public static void main(String[] args) {

        Creator c = new ConcreteCreator();

        c.anOperation();

        Product p = c.factoryMethod();

        p.doSomething();

    }






}
