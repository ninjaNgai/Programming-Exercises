package Chapter1;

import Chapter1.Behaviors.Flying.FlyBehavior;
import Chapter1.Behaviors.Quacking.QuackBehavior;

public abstract class Duck {
    // These are declared as interface type.
    // Each duck object will set these variables polymorphically to reference the
    // specific bahevior type it would like at runtime (FlyWithWings, Squeak, etc.)
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();

    // Method replaces fly()
    public void performFly() {
        flyBehavior.fly();
    }

    // Method replaces quack()
    public void performQuack() {
        // Duck object delegates that behavior to the object referenced by quackBehavior
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}