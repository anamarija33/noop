package pckg_weather_station;

public class App {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(20, 1015, 50);
        MobilePhoneWeatherApp mobilePhoneWeatherApp = new MobilePhoneWeatherApp();
        MobilePhoneWeatherApp mobilePhoneWeatherApp2 = new MobilePhoneWeatherApp();
        mobilePhoneWeatherApp.setWeatherStation(weatherStation);
        mobilePhoneWeatherApp2.setWeatherStation(weatherStation);
        weatherStation.add(mobilePhoneWeatherApp);
        weatherStation.add(mobilePhoneWeatherApp2);
        weatherStation.setStateWeatherData(25, 1010, 60);




    }
}
