package learn_design_patterns.behaviors.chain_of_responsibility;

public abstract class OrderHandler {

    protected OrderHandler nextHandler;

    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void processHandler(Order order);
}
