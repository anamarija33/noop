package pckg_dec_icecream;

public class HazelnutPowder extends IceCreamDecorator{

    protected HazelnutPowder(int amount, IceCream iceCream) {
        super(amount, iceCream);
    }

    @Override
    protected double calculatePrice() {
        return this.amount*IceCreamDecorator.unitDecoPrice + this.iceCream.calculatePrice();
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + " decorates: " + this.iceCream;
    }
}
