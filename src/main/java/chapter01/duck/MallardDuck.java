package chapter01.duck;

import chapter01.behavior.FlyWithWings;
import chapter01.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("Mallard Duck");
    }
}
