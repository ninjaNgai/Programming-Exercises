package Chapter1.Behaviors.Flying;

/**
 * Implementation of flying for all ducks that have wings.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

}