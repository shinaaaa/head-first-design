package chapter06.stereo;

public class Stereo {
    private final String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("Stereo.on");
    }

    public void setCd() {
        System.out.println("Stereo.setCd");
    }

    public void setVolume(int i) {
        System.out.println("Stereo.setVolume : " + i);
    }

    public void setDvd() {
        System.out.println("Stereo.setDvd");
    }

    public void setRadio() {
        System.out.println("Stereo.setRadio");
    }

    public void off() {
        System.out.println("Stereo.off");
    }
}
