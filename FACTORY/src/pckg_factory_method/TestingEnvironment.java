package pckg_factory_method;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingEnvironment {

    public static void main(String[] args) {
        CarStoreApp carStoreApp = new CarStoreApp(new UKCarStore("UK Car Store"));
        try {
            Car car1 = carStoreApp.orderSomeCarDefined("Toyota", "Corolla", "Seda");
        }catch (NullPointerException e) {
            System.out.println(e.getStackTrace());
        }
        CarStoreApp euStoreApp = new CarStoreApp(new EUCarStore("EU Car Store"));
        Car car2 = euStoreApp.orderSomeCarDefined("Mercedes", "Z", "SUV");
        System.out.println(car2);
        ArrayList<String[]> data = new ArrayList<>();
        data = AUX_CLS.readDataFromFile();
        System.out.println("From file ____________________________________________");
        for (String[] s : data) {
            System.out.println(Arrays.toString(s));
            try {
                Car car = euStoreApp.orderSomeCarDefined(s[0].strip(), s[1].strip(), s[2].strip());
                carStoreApp.addOrderedCar(car);
                System.out.println(car);
            }catch (NullPointerException e) {
                System.out.println(e.getStackTrace());
            }
        }
    }

}
