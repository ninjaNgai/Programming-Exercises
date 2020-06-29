package Chapter1;

import Chapter1.Behaviors.Flying.FlyBehavior;
import Chapter1.Behaviors.Quacking.QuackBehavior;

public class DuckCall implements QuackBehavior {

    public DuckCall() {

    }

    @Override
    public void quack() {
        System.out.println("Quackkkkkk");
    }

}