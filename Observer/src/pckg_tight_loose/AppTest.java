package pckg_tight_loose;

public class AppTest {
    public static void main(String[] args) {

        Car car = new Car(new Engine());
        car.driveCar();

        Car car2 = new Car(new Engine());
        car2.driveCar();

    }
}
