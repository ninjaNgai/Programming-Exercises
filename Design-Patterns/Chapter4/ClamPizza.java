public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    // To make a pizza now, we need a factory to provide the ingredients. So each
    // pizza class gets a factory passed into its constructor, and it's stored in an
    // instance variable
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        // The prepare() method steps through creating a cheese pizza and each time it
        // needs an ingredient, it asks the factory to produce it.
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
