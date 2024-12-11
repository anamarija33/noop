package pckg_factory_method;

public class EU_Sedan extends Car {
    protected EU_Sedan(String brand, String model) {
        super(brand, model);
    }

    @Override
    protected void produceCar() {
        System.out.println("Producing car: "+this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "EU_Sedan{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
