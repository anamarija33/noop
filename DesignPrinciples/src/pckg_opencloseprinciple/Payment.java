package pckg_opencloseprinciple;

import java.sql.SQLOutput;

public class Payment {


    public static void payWithCreditCard(double amount) {
        System.out.println("Paying " + amount + " with credit card");
    }

    public static void payWithPayPal(double amount) {
        System.out.println("Paying " + amount + " with PayPal");

    }

    public static void payWithGoogleWallet(double amount) {
        System.out.println("Paying"+amount+ "with Google Wallet");
    }
}
