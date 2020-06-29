package Chapter1;

import Chapter1.Behaviors.Flying.FlyRocketPowered;

public class MiniDucksSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly(); // first call to performFly() delegates to the flyBehavior obj set in
                            // ModelDuck's constructor, which is a FlyNoWay instance

        // To change a duck's behavior at runtime, call the duck's setter method for
        // that behavior
        model.setFlyBehavior(new FlyRocketPowered()); // this invokes the model's inherited behavior setter method
        model.performFly(); // Model has dynamically changed its flying behavior

        // Brain Power challenge: How would you implement your own duck call that does
        // not inherit from the Duck class?
        DuckCall device = new DuckCall();
        device.quack();
    }

}