package pckg_dec_icecream;

public class DarkChocolateOverlay extends IceCreamDecorator{

    public DarkChocolateOverlay(int amount, IceCream iceCream) {
        super(amount, iceCream);
    }

    @Override
    protected double calculatePrice() {
        return this.iceCream.calculatePrice() + this.amount*IceCreamDecorator.unitDecoPrice;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " decorates: " + this.iceCream;
    }


}
