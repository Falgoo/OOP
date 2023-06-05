package learn_design_patterns.behaviors.state;

public class Application {

    public static void main(String[] args) {
        VendingState.setState(new IdleState());
        VendingState.insertCoin(); // Outputs: Coin inserted
        VendingState.selectProduct(); // Outputs: Product already selected
        VendingState.dispenseProduct(); // Outputs: Product dispensed
        VendingState.selectProduct(); // Outputs: Please insert a coin first
        VendingState.insertCoin(); // Outputs: Coin inserted
        VendingState.dispenseProduct(); // Outputs: Product dispensed
    }
}
