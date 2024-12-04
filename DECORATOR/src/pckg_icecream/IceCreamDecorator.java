package pckg_icecream;

public abstract class IceCreamDecorator extends AbsIceCream{

    protected AbsIceCream component;
    protected IceCreamDecorator(String name, double uPrice, int amount, AbsIceCream component) {
        super(name, uPrice, amount);
        this.component = component;

    }

    protected abstract double decoratedPrice();

    @Override
    protected double cost() {
        double price = this.component.cost() + unitPrice * amount;
        System.out.println(getClass().getSimpleName() + " decorates: " + this.component.getClass().getSimpleName());
        System.out.println("Price is : " + price);
        return price;
    }
}
