package chapter01SimUDuck.Ducks;

import chapter01SimUDuck.Behaviors.Fly.FlyNoWay;
import chapter01SimUDuck.Behaviors.Quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
