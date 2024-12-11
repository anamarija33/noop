package pckg_no_factory;

public class SUV extends Car{


    protected SUV(String brand, String model) {
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
