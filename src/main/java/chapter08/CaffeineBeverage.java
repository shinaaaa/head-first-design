package chapter08;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    private void boilWater() {
        System.out.println("CaffeineBeverage.boilWater");
    }

    private void pourInCup() {
        System.out.println("CaffeineBeverage.pourInCup");
    }
}
