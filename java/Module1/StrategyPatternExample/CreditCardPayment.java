package Module1.StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("paid using credit card");
    }
}
