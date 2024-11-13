package pckg_weather_station2;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{
    private double temperature;
    private double pressure;
    private double humidity;
    private boolean isChanged;
    private final List<Observer> observers;

    public WeatherStation(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        observers = new ArrayList<>();
    }

    public void setStateWeatherData(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        System.out.println("Weather data changed.");

    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void listAllObservers(){
        for (Observer observer : observers) {
            System.out.println(observer);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println("Observer added." + observer);
        } else {
            System.out.println("This one is already in observable list.");
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
            System.out.println("Observer removed.");
        } else {
            System.out.println("This one is not in observable list.");
        }
    }

    @Override
    public void notifyObservers() {

    }
}
