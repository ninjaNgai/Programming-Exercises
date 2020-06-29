package Chapter1.Behaviors.Flying;

/**
 * Implementation of flying for all ducks that can't fly.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}