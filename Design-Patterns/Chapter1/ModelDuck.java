package Chapter1;

import Chapter1.Behaviors.Flying.FlyNoWay;
import Chapter1.Behaviors.Quacking.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");

    }

}