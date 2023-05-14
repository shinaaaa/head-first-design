package chapter01.behavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("잘 날 수 있다.");
    }
}
