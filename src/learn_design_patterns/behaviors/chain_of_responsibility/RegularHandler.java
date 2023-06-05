package learn_design_patterns.behaviors.chain_of_responsibility;

public class RegularHandler extends OrderHandler {

    @Override
    public void processHandler(Order order) {
        if (order.getType().equals("regular")) {
            System.out.println("Processing regular type: " + order.getId());
        } else if (nextHandler != null) {
            nextHandler.processHandler(order);
        }
    }
}
