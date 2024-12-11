package pckg_dec_icecream;

public class VanillaFlavor extends IceCream{

    public VanillaFlavor(int amount) {
        super(amount);
    }

    @Override
    protected double calculatePrice() {
        return this.amount*IceCream.unitPrice;
    }

    @Override
    public String toString() {
        return "VanillaFlavor{" +
                "amount=" + amount +
                '}';
    }
}
