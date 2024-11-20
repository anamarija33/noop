package pckg_tight_loose;

public class Car {
    // car ima pristup svim metodama klase Engine
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void driveCar(){
        engine.startEngine();
        System.out.println("The car is being driven");
    }
}
