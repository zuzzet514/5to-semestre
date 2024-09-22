package book;

public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }

    @Override
    public void anOperation() {
        System.out.println("I'm ConcreteCreator instance");
    }
}
