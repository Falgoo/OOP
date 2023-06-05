package learn_design_patterns.behaviors.chain_of_responsibility;

public class ExpeditedHandler extends OrderHandler {
    @Override
    public void processHandler(Order order) {
        if (order.getType().equals("expedited")) {
            System.out.println("Processing expedited type: " + order.getId());
        } else if (nextHandler != null) {
            nextHandler.processHandler(order);
        }
    }
}
