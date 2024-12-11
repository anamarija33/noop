package pckg_ice_cream_no_way;

public class TestNoWa {
    public static void main(String[] args) {
        IceCream iceCream = new DarkChocolateDeco(1,new HazelnutDeco(2,new VanillaFlavor(3)));
        System.out.println("Price :"+iceCream.catlculatePrice());
        System.out.println(iceCream);

    }
}
