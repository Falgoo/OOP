package learn_design_patterns.behaviors.state;

public class VendingState {

    private static VendingMachineState vendingMachineState;

    public static void setState(VendingMachineState state) {
        vendingMachineState = state;
    }

    public static void insertCoin() {
        vendingMachineState.insertCoin();
    }

    public static void selectProduct() {
        vendingMachineState.selectProduct();
    }

    public static void dispenseProduct() {
        vendingMachineState.dispenseProduct();
    }
}
