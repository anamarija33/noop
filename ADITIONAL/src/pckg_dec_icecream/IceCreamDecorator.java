package pckg_dec_icecream;

public abstract class IceCreamDecorator extends  IceCream{
    //može se koristiti setters ali se najčešće koristi konstruktor za setter
    protected IceCream iceCream;
    protected static final double unitDecoPrice = 0.5;

    protected IceCreamDecorator(int amount, IceCream iceCream) {
        super(amount);
        this.iceCream = iceCream;

    }


}
