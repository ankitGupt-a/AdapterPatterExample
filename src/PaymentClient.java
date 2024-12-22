public class PaymentClient {
    private final PaymentProcessor paymentProcessor;

    public PaymentClient(final PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void pay(final int amount) {
        paymentProcessor.pay(amount);
    }
}
