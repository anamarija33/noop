package pckg_factory_method;

public class UKCarStore extends CarStore {

    public UKCarStore(String carStoreName) {
        super(carStoreName);
    }

    @Override
    protected Car orderCar(String brand, String model, String type) throws IllegalArgumentException {
        return switch (type) {
            case "SUV" -> new UK_SUV(brand, model);
            case "Sedan" -> new UK_Sedan(brand, model);
            default -> throw new IllegalArgumentException("Not a defined type of car!");
        };
    }
}
