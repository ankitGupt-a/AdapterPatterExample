public class Main {
    public static void main (String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new Paypal());
        PaymentClient client1 = new PaymentClient(paypalProcessor);

        client1.pay(100);

        PaymentProcessor stipeProcessor = new StripeAdapter(new Stripe());
        PaymentClient client2 = new PaymentClient(stipeProcessor);

        client2.pay(200);

    }
}