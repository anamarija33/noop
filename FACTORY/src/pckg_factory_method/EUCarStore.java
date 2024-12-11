package pckg_factory_method;

public class EUCarStore extends CarStore{


    public EUCarStore(String carStoreName) {
        super(carStoreName);
    }

    @Override
    protected Car orderCar(String brand, String model, String type) throws IllegalArgumentException{
        return switch (type) {
            case "SUV" -> new EU_SUV(brand, model);
            case "Sedan" -> new EU_Sedan(brand, model);
            default -> throw new IllegalArgumentException("Not a defined type of car!");
        };
    }
}
