package chapter04.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Pizza.prepare");
    }

    void bake() {
        System.out.println("Pizza.bake");
    }

    void cut() {
        System.out.println("Pizza.cut");
    }

    void box() {
        System.out.println("Pizza.box");
    }

    public String getName() {
        return name;
    }
}
