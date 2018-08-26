package chapter01SimUDuck;

import chapter01SimUDuck.Ducks.Duck;
import chapter01SimUDuck.Ducks.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
