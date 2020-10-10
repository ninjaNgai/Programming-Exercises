package Chapter3;

public class Soy extends CondimentDecorator {

    // We're going to instantiate Soy w/ a reference to Beverage using:
    // 1) An instance variable to hold the beverage we are wrapping
    Beverage beverage;

    // 2) A way to set this instance variable to the object we are wrapping. Here,
    // we're going to pass the beverage we're wrapping to the decorator's
    // constructor.
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {

        switch (beverage.getSize()) {
            case TALL:
                return beverage.cost() + .10;
            case GRANDE:
                return beverage.cost() + .15;
            case VENTI:
                return beverage.cost() + .20;
            default:
                break;
        }

        return beverage.cost() + .15;
    }

}
