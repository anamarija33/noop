package pckg_icecream;

public class CookiePowder extends IceCreamDecorator{


    protected CookiePowder(String name, double uPrice, int amount, AbsIceCream component) {
        super(name, uPrice, amount, component);
    }

    @Override
    protected double decoratedPrice() {
        return 0;
    }
}
