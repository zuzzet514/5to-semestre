package coffe.ex;

public class BrewingUnit {

    public CoffeeDrink brew (CoffeeSelection selection, GroundCoffee groundCoffee, double quantity) {
        return new CoffeeDrink(selection, quantity);
    }
}
