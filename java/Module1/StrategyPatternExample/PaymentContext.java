package Module1.StrategyPatternExample;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentMethod(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay() {
        strategy.pay();
    }
}
