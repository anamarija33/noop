package pckg_icecream;

public class HoneyOverflow extends IceCreamDecorator{
    protected HoneyOverflow(String name, double uPrice, int amount, AbsIceCream component) {
        super(name, uPrice, amount, component);
    }

    @Override
    protected double decoratedPrice(){
        double price = this.cost();
        return price;
    }

}
