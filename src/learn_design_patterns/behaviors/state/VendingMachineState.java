package learn_design_patterns.behaviors.state;

public interface VendingMachineState {
    void insertCoin();
    void selectProduct();
    void dispenseProduct();
}
