package Chapter1.Behaviors.Quacking;

/**
 * Implementation for quacks that squeak
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");

    }

}