package pckg_weather_station2;

public interface Observer {
    void update(float temperature, float humidity, float pressure);

    void register(Observable observable);

    void unregister(Observable observable);
}
