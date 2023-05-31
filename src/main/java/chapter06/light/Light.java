package chapter06.light;

public class Light {
    private final String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Light.on");
    }

    public void off() {
        System.out.println("Light.off");
    }
}
