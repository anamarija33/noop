package pckg_factory_method;

public abstract class CarStore {

    protected String carStoreName;

    public CarStore(String carStoreName) {
        this.carStoreName = carStoreName;
    }

    protected abstract Car orderCar(String brand, String model, String type) throws IllegalArgumentException;
}
