package chapter04;

import chapter04.pizza.NYPizzaStore;
import chapter04.pizza.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza cheese = nyPizzaStore.orderPizza("cheese");
        System.out.println("cheese = " + cheese.getName());
    }
}
