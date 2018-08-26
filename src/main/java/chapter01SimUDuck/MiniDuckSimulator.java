package chapter01SimUDuck;

import chapter01SimUDuck.Behaviors.Fly.FlyBehavior;
import chapter01SimUDuck.Behaviors.Fly.FlyRocketPowered;
import chapter01SimUDuck.Ducks.Duck;
import chapter01SimUDuck.Ducks.MallardDuck;
import chapter01SimUDuck.Ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
