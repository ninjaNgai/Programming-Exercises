package Chapter2.Weather;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherDataSubject) {
        this.weatherData = weatherDataSubject;
        weatherDataSubject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.format("Current conditions: %.1fF degrees and %.1f humidity\n", temperature, humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

}