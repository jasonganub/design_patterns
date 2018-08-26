package chapter01SimUDuck.Behaviors.Quack;

import chapter01SimUDuck.Behaviors.Quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
