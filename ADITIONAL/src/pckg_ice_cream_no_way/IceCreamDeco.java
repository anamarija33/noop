package pckg_ice_cream_no_way;

public class IceCreamDeco extends IceCream{

    protected static final double unitDecoPrice =0.5;
    private IceCream iceCreamToDecorate;

    public IceCreamDeco(int amount, IceCream iceCreamToDecorate) {
        super(amount);
        this.iceCreamToDecorate = iceCreamToDecorate;
    }

    @Override
    public double catlculatePrice() {
        return this.iceCreamToDecorate.catlculatePrice()+this.amount * IceCreamDeco.unitDecoPrice;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " decorates: " + this.iceCreamToDecorate;
    }

}
