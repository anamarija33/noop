package pckg_no_factory;

public class SimpleCarCreator {

    public static Car produceCar(String brand, String model, String type) throws IllegalArgumentException{
        return switch (type) {
            case "SUV" -> new SUV(brand, model);
            case "Sedan" -> new Sedan(brand, model);
            default -> throw new IllegalArgumentException("Not a defined type of car!");
        };
    }
}
