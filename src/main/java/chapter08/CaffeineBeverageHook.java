package chapter08;

public abstract class CaffeineBeverageHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    private void boilWater() {
        System.out.println("CaffeineBeverage.boilWater");
    }

    private void pourInCup() {
        System.out.println("CaffeineBeverage.pourInCup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
