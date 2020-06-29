package Chapter1.Behaviors.Quacking;

/**
 * Implementation for quacks that really quack
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack quack");
    }

}