package learn_design_patterns.behaviors.state;

public class IdleState implements VendingMachineState {
    @Override
    public void insertCoin() {
        System.out.println("coin inserted");
        VendingState.setState(new ProductSelectedState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Please insert coin first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert coin and select product");
    }
}
