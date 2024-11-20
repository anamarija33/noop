package pckg_better_loose_coupling;

public class AppTest {

    public static void main(String[] args) {
        Engine electricEngine = new ElectricEngine();
        Engine combustionEngine = new CombustionEngine();

        Car electricCar = new Car(electricEngine);
        Car combustionCar = new Car(combustionEngine);

        electricCar.driveCar();
        combustionCar.driveCar();
    }
}
