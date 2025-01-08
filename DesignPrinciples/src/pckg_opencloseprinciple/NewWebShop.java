package pckg_opencloseprinciple;

public class NewWebShop {
    private IPayment payment;

    public NewWebShop(IPayment payment){
        this.payment = new CreditCardPayment();
    }

    public void setPaymentMethod(IPayment paymentMethod) {
        this.payment = paymentMethod;
    }

    public void performPayment(double amount) {
        payment.performPayment(amount);
    }

}
