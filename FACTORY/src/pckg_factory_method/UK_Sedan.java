package pckg_factory_method;

public class UK_Sedan extends Car {
    protected UK_Sedan(String brand, String model) {
        super(brand, model);
    }

    @Override
    protected void produceCar() {
        System.out.println("Producing car: "+this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "UK_Sedan{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
