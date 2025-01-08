package pckg_opencloseprinciple;

public class CreditCardPayment implements IPayment {

    @Override
    public void performPayment(double amount) {
        System.out.println(getClass().getSimpleName() + "payment amount: "+amount);
    }

}
