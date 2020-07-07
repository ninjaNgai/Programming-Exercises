package Chapter2.Weather;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}