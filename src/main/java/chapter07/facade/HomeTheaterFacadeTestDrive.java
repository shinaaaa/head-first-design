package chapter07.facade;

public class HomeTheaterFacadeTestDrive {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(new Amplifier(), new Tuner(), new StreamingPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());

        homeTheater.watchMovie("스파이더맨");
        homeTheater.endMovie();
    }
}
