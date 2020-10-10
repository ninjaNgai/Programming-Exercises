package Chapter3;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        printDetails(beverage);

        // Subtype polymorphism example
        Beverage beverage2 = new DarkRoast(); // Make a DarkRoast object
        beverage2 = new Mocha(beverage2); // Wrap it with a Mocha
        beverage2 = new Mocha(beverage2); // Wrap it in a second Mocha
        beverage2 = new Whip(beverage2); // Wrap it with a Whip
        printDetails(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        printDetails(beverage3);
    }

    // Helper method to print the description and cost
    public static void printDetails(Beverage beverage) {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }

}
