package learn_design_patterns.behaviors.state;

public class ProductSelectedState implements VendingMachineState {

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product already selected");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Product dispensed");
        VendingState.setState(new IdleState());
    }
}
