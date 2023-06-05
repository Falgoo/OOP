package learn_design_patterns.behaviors.chain_of_responsibility;

public class InternationalOrderHandler extends OrderHandler {
    @Override
    public void processHandler(Order order) {
        if (order.getType().equals("international")) {
            System.out.println("Processing international type: " + order.getId());
        } else if (nextHandler != null) {
            nextHandler.processHandler(order);
        }
    }
}
