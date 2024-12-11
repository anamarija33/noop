package pckg_factory_method;

import java.util.ArrayList;

public class CarStoreApp {
    private CarStore carStore;
    private final ArrayList<Car> orderedCars;
    public CarStoreApp(CarStore carStore) {
        this.carStore = carStore;
        this.orderedCars = new ArrayList<>();
    }
    public void addOrderedCar(Car car) {
        this.orderedCars.add(car);
    }
    public Car orderSomeCarDefined(String brand, String model, String type) throws NullPointerException{
        Car car= null;
        try {
            car = carStore.orderCar(brand, model, type);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return car;
    }

}
