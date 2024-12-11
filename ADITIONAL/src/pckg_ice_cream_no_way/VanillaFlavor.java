package pckg_ice_cream_no_way;

public class VanillaFlavor extends IceCream {


    public VanillaFlavor(int amount) {
        super(amount);
    }

    @Override
    public String toString() {
        return "VanillaFlavor{" +
                "amount=" + amount +
                '}';
    }
}
