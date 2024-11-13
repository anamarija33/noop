package pckg_weather_station;

public interface ObservableWeatherStation {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyAllObservers();
}
