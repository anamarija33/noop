package pckg_opencloseprinciple;

import static pckg_opencloseprinciple.Payment.*;

public class WebShop {
    private Payment payment;
    private double amount;

    public WebShop(Payment payment) {
        this.payment = payment;
    }

    public void performPayment(int paymentChoice) {
        switch (paymentChoice) {
            case 1:
                payWithCreditCard(amount);
                break;
            case 2:
                payWithPayPal(amount);
                break;
            case 3:
                payWithGoogleWallet(amount);
                break;
            default:
                throw new IllegalArgumentException("Only 1-3 choices");
        }
    }
}
