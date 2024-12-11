package pckg_ice_cream_no_way;

public class IceCream {
    protected int amount;
    protected static final double unitPrice = 2.0;

    public IceCream(int amount) {
        this.amount = amount;

    }

    public double catlculatePrice(){
        return this.amount*unitPrice;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "amount=" + amount +
                '}';
    }
}
