package chapter04.pizza;

public class NYPizzaFactory {

    public Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("greek".equals(type)) {
            return new GreekPizza();
        } else if ("pepperoni".equals(type)) {
            return new PepperoniPizza();
        }
        return null;
    }
}
