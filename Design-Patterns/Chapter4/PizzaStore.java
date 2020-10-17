/**
 * Each subclass provides an implementation of the createPizza() method,
 * overriding this abstract createPizza() method in PizzaStore, while all
 * subclasses make use of the orderPizza() method.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type); // call to a method in the PizzaStore rather than a factory object

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}