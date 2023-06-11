package chapter07.facade;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier.on");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println("Amplifier.setStreamingPlayer");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier.setSurroundSound");
    }

    public void setVolume(int i) {
        System.out.println("Amplifier.setVolume");
    }

    public void off() {
        System.out.println("Amplifier.off");
    }
}
