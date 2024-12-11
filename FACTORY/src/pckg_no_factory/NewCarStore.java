package pckg_no_factory;

public class NewCarStore {

    private Car car;
    public NewCarStore() {
        System.out.println("New Car Store created!");
    }

    public void orderCar(String brand, String model, String type){
        try {
            car = SimpleCarCreator.produceCar(brand, model, type);
            System.out.println("Ordered Car: " + car);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

}
