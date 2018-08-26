package chapter01SimUDuck.Behaviors.Fly;

import chapter01SimUDuck.Behaviors.Fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can't fly!");
    }
}
