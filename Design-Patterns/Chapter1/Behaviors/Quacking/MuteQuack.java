package Chapter1.Behaviors.Quacking;

/**
 * Implementation for quacks that make no sound at all
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}