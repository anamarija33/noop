package pckg_factory_1;

public class TestFactory {
    public static void main(String[] args) {

        CarStoreEU_UK carStore = new CarStoreEU_UK();
        try {
            Car car = carStore.orderEUCar("Toyota", "Corolla", "Sedan");
            System.out.println("Car ordered for eu market");
        } catch (NullPointerException e) {

            System.out.println("Car is not created - null pointer exception");
        }


        try {
            Car car1 = carStore.orderUKCar("BMW", "M3", "Sedan");
            System.out.println("Car ordered for uk market");
        } catch (NullPointerException e) {
            System.out.println("Car is not created - null pointer exception");
        }


    }
}
