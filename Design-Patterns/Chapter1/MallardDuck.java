package Chapter1;

import Chapter1.Behaviors.Flying.FlyWithWings;
import Chapter1.Behaviors.Quacking.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        // MallardDuck inherits the quackBehavior and flyBehavior instance variables
        // from class Duck
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}