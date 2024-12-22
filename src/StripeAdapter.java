public class StripeAdapter implements PaymentProcessor{
    private final Stripe stripe;

    public StripeAdapter(final Stripe stripe) {
        this.stripe = stripe;
    }

    public void pay(final int amount) {
        stripe.sendPayment(amount);
    }
}
