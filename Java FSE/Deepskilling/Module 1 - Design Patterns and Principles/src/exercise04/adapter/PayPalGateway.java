package exercise04.adapter;

public class PayPalGateway {
    public void payWithPayPal(double amount) {
        System.out.println("Paid Rs." + amount + " using PayPal Gateway");
    }
}
