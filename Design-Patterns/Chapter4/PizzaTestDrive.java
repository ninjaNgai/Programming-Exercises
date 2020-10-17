public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Mickey orderd a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("clam");
        System.out.println("Minnie orderd a " + pizza.getName() + "\n");

        pizza = californiaPizzaStore.orderPizza("pepperoni");
        System.out.println("Donald orderd a " + pizza.getName() + "\n");
    }

}
