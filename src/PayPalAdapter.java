public class PayPalAdapter implements PaymentProcessor{
    private final Paypal paypal;

    public PayPalAdapter(final Paypal paypal) {
        this.paypal = paypal;
    }

    public void pay(final int amount) {
        paypal.makePayment(amount);
    }
}
