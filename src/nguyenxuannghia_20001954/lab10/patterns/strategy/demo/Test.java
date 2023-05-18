package nguyenxuannghia_20001954.lab10.patterns.strategy.demo;

public class Test {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Process payment using CreditCardStrategy
        paymentProcessor.setPaymentStrategy(new CreditCardStrategy("1234567890123456", "12/24", "123"));
        paymentProcessor.processPayment(100.0);

        // Process payment using PayPalStrategy
        paymentProcessor.setPaymentStrategy(new PayPalStrategy("example@example.com", "password"));
        paymentProcessor.processPayment(50.0);

        // Process payment using BankTransferStrategy
        paymentProcessor.setPaymentStrategy(new BankTransferStrategy("1234567890", "9876543210"));
        paymentProcessor.processPayment(200.0);
    }
}
