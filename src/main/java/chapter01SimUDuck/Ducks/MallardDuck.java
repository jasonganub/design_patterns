package chapter01SimUDuck.Ducks;

import chapter01SimUDuck.Behaviors.Fly.FlyWithWings;
import chapter01SimUDuck.Behaviors.Quack.Quack;
import chapter01SimUDuck.Ducks.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
