package pckg_better_loose_coupling;

public class Car {
    private final Engine engine;
// dependency injection? temeljen na sučelju, ne na konkretnim klasama
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void driveCar() {
        engine.start();
        System.out.println("Driving a car");
    }

    public void stopCar() {
        engine.stop();
        System.out.println("Stopping a car");
    }

}
