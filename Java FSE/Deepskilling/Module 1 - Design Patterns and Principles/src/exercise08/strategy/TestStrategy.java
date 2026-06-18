package exercise08.strategy;

public class TestStrategy {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(5000);

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(2500);
    }
}