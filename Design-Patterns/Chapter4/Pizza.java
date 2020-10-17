import java.util.ArrayList;

/**
 * Pizza is an abstract class with some helpful implementations that can be
 * overriden
 */
public abstract class Pizza {
    public String name;
    public String cutStyle;

    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public ArrayList<String> toppings = new ArrayList<String>();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into " + cutStyle + " slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCutStyle(String style) {
        this.cutStyle = style;
    }

    public String toString() {
        // code to print pizza here
        return "";
    }
}
