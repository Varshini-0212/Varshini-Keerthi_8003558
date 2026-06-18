package exercise04.adapter;

public class TestAdapter {

    public static void main(String[] args) {

        PaymentProcessor payPal =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor razorpay =
                new RazorpayAdapter(new RazorpayGateway());

        payPal.processPayment(2500);

        razorpay.processPayment(4500);
    }
}