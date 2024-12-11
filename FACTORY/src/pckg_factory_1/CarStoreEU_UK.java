package pckg_factory_1;

public class CarStoreEU_UK {

    public Car orderEUCar(String brand, String model, String type) throws NullPointerException{
        Car car = null;
        try {
            car =  SimpleCarCreator.produceEUCar(brand, model, type);
            System.out.println("Produced EU car: " + car);
        }catch (IllegalArgumentException e){
            System.out.println(e.fillInStackTrace());
        }
        return car;
    }

    public Car orderUKCar(String brand, String model, String type) throws NullPointerException{
        Car car = null;
        try {
            car =  SimpleCarCreator.produceUKCar(brand, model, type);
            System.out.println("Produced UK car: " + car);
        }catch (IllegalArgumentException e){
            System.out.println(e.fillInStackTrace());
        }
        return car;
    }

}
