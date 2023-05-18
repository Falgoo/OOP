package nguyenxuannghia_20001954.lab10.patterns.strategy.exercise1;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
