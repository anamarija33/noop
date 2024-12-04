package pckg_icecream;

public class Test {
    public static void main(String[] args) {
        Chocolate ch1 = new Chocolate("Chocolate", 2.0, 2);
        ch1.cost();
        ch1.desc();

        HoneyOverflow honeyOverflow1 = new HoneyOverflow("Honey overflow", 0.5, 2,ch1);
        double finalPrice = honeyOverflow1.decoratedPrice();
        System.out.println("Final price: "+finalPrice);
    }
}
