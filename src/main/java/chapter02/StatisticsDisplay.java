package chapter02;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private final WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics : temperature = " + temperature + ", humidity = " + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
