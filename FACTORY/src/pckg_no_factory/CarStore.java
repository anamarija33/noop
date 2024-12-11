package pckg_no_factory;

public class CarStore {

    private String carStoreName;
    public CarStore(String carStoreName) {
        this.carStoreName = carStoreName;
    }

    public Car orderCar(String brand, String model, String type) {
        switch(type) {
            case "SUV":
                return new SUV(brand, model);
            case "Sedan":
                return new Sedan(brand, model);
            default:
                throw new IllegalArgumentException("Not legal car type!");
        }
    }
}
