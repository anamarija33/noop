package pckg_factory_1;

public class UK_SUV extends Car {


    protected UK_SUV(String brand, String model) {
        super(brand, model);
    }

    @Override
    protected void produceCar() {
        System.out.println("Producing car: " + this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "SUV{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
