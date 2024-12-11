package pckg_dec_icecream;

public class TestApp {
    public static void main(String[] args) {
        IceCream iceCream = new HazelnutPowder(1, new DarkChocolateOverlay(1, new VanillaFlavor(3)));
        System.out.println("Price for this ice cream is :" + iceCream.calculatePrice());
        System.out.println(iceCream);
    }
}
