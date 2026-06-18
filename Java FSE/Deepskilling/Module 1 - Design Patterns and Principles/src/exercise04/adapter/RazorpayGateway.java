package exercise04.adapter;

public class RazorpayGateway {

    public void makeRazorPayment(double amount) {
        System.out.println("Paid Rs." + amount + " using Razorpay Gateway");
    }
}