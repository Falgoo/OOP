package nguyenxuannghia_20001954.lab10.patterns.strategy.demo;

public class CreditCardStrategy implements PaymentStrategy {

    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardStrategy(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount +
                " with card number: " + cardNumber);
        // Additional credit card payment processing logic here
    }
}
