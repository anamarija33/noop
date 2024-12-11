package pckg_factory_method;

public class EU_SUV extends Car {


    protected EU_SUV(String brand, String model) {
        super(brand, model);
    }

    @Override
    protected void produceCar() {
        System.out.println("Producing car: " + this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "EU_SUV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
