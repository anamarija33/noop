package pckg_weather_station;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObservableWeatherStation {


    private double temperature;
    private double pressure;
    private double humidity;
    private final List<Observer> observers;


    public WeatherStation(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.observers = new ArrayList<>();
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

    public void setStateWeatherData(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        System.out.println("Weather data changed.");
        notifyAllObservers();
    }

    @Override
    public void add(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
            System.out.println("Observer added." + observer);
        } else {
            System.out.println("This one is already in observable list.");
        }
    }

    @Override
    public void remove(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
            System.out.println("Observer removed.");
        } else {
            System.out.println("This one is not in observable list.");
        }
    }

    @Override
    public void notifyAllObservers() {
        if (observers.isEmpty()) {
            System.out.println("No observers to notify.");

        } else {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }
}
