package pckg_factory_1;

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
        return "Sedan{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
