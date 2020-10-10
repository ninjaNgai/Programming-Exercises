package Chapter3;

public class Espresso extends Beverage {
    public Espresso() {
        // description instance variable is inherited from Beverage
        description = "Espresso";
    }

    @Override
    public double cost() {
        // We don't need to worry about adding condiments in this class, we just need to
        // return the price of an Espresso
        return 1.99;
    }
}
