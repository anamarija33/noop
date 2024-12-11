package pckg_dec_icecream;

public abstract class IceCream {

    protected static final double unitPrice = 2;
    protected int amount;

    protected IceCream(int amount) {
        this.amount = amount;
    }

    protected abstract double calculatePrice();

}
