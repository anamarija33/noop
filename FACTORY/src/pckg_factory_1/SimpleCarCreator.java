package pckg_factory_1;

public class SimpleCarCreator {

    public static Car produceEUCar(String brand, String model, String type) throws IllegalArgumentException{
        return switch (type) {
            case "SUV" -> new EU_SUV(brand, model);
            case "Sedan" -> new EU_Sedan(brand, model);
            default -> throw new IllegalArgumentException("Not a defined type of car!");
        };
    }

    public static Car produceUKCar(String brand, String model, String type) throws IllegalArgumentException{
        return switch (type) {
            case "SUV" -> new UK_SUV(brand, model);
            case "Sedan" -> new UK_Sedan(brand, model);
            default -> throw new IllegalArgumentException("Not a defined type of car!");
        };
    }
}
