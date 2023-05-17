package chapter02;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private final WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast : temperature = " + temperature + ", humidity = " + humidity + ", pressure = " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
