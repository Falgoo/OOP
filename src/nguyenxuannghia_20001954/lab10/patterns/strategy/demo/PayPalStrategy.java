package nguyenxuannghia_20001954.lab10.patterns.strategy.demo;

public class PayPalStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount +
                " with email: " + email);
        // Additional PayPal payment processing logic here
    }
}

