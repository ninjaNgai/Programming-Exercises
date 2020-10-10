package Chapter3;

/**
 * Mocha is a decorator, so we extend CondimentDecorator (which extends
 * Beverage)
 */
public class Mocha extends CondimentDecorator {
    // We're going to instantiate Mocha w/ a reference to Beverage using:
    // 1) An instance variable to hold the beverage we are wrapping
    Beverage beverage;

    // 2) A way to set this instance variable to the object we are wrapping. Here,
    // we're going to pass the beverage we're wrapping to the decorator's
    // constructor.
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // We want our description to include each item decorating the beverage (for
        // instance: "Dark Roast, Mocha"). So we first delegate to the object we ar
        // edecorating to get its description, then append ", Mocha" to that
        // description.
        return beverage.getDescription() + ", Mocha";
    }

    // First, delegate the call to the object we're decorating, so that it can
    // compute the cost; then we, add the cost of Mocha to the result
    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

}
