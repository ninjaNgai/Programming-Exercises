package Chapter3;

/**
 * Description: Beverage is an abstract class with the two methods
 * getDescription() and cost()
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    // Sharpen Your Pencil
    public enum Size {
        TALL, GRANDE, VENTI
    };

    Size size = Size.TALL;

    /**
     * getDescription() is already implemented for us, but we need to implement
     * cost() in the subclasses
     */
    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
