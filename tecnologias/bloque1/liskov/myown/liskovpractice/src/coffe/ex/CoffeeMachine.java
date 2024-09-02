package coffe.ex;

public interface CoffeeMachine {
    CoffeeDrink brewCoffee(CoffeeSelection selection) throws CoffeeException;

}
