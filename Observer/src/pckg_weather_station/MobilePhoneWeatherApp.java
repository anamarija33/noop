package pckg_weather_station;

public class MobilePhoneWeatherApp implements Observer, Display{
    private double temperature;
    private double pressure;
    private double humidity;
    private WeatherStation weatherStation;

    public MobilePhoneWeatherApp() {

    }

    public void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void display() {
        System.out.println("Displaying: ");
        System.out.println(temperature + "°C");
        System.out.println(pressure+" hPa");
        System.out.println(humidity+"%");
    }

    @Override
    public void update() {
        this.pressure = weatherStation.getPressure();
        this.humidity = weatherStation.getHumidity();
        this.temperature = weatherStation.getTemperature();
        System.out.println("All data updated.");
        System.out.println(Integer.toHexString(hashCode()) + "@" + getClass().getSimpleName());
        display();
        weatherStation.notifyAllObservers();

    }
}
