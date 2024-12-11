package pckg_factory_1;

public abstract class Car {
    protected String brand;
    protected String model;

    protected Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    protected abstract void produceCar();

}
