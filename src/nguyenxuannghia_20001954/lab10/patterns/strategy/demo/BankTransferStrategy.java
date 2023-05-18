package nguyenxuannghia_20001954.lab10.patterns.strategy.demo;

public class BankTransferStrategy implements PaymentStrategy {

    private String accountNumber;
    private String routingNumber;

    public BankTransferStrategy(String accountNumber, String routingNumber) {
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
    }

    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of $" + amount +
                " with account number: " + accountNumber);
        // Additional bank transfer payment processing logic here
    }
}

