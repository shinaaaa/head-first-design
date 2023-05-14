package chapter01.duck;

import chapter01.behavior.FlyNoWay;
import chapter01.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("Model Duck");
    }
}
