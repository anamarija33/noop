package pckg_dec_icecream;

public class ChocolateFlavor extends IceCream{

    public ChocolateFlavor(int amount) {
        super(amount);
    }

    @Override
    protected double calculatePrice() {
        return this.amount*IceCream.unitPrice;    }

    @Override
    public String toString() {
        return "ChocolateFlavor{" +
                "amount=" + amount +
                '}';
    }
}

