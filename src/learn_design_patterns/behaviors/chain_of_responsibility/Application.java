package learn_design_patterns.behaviors.chain_of_responsibility;

public class Application {

    public static void main(String[] args) {
        RegularHandler regularHandler = new RegularHandler();
        InternationalOrderHandler internationalOrderHandler = new InternationalOrderHandler();
        ExpeditedHandler expeditedHandler = new ExpeditedHandler();

        Order order1 = new Order("001", "regular");
        Order order2 = new Order("002", "international");
        Order order3 = new Order("003", "expedited");

        regularHandler.processHandler(order1);
        regularHandler.processHandler(order2);
        regularHandler.processHandler(order3);

        internationalOrderHandler.processHandler(order1);
        internationalOrderHandler.processHandler(order2);
        internationalOrderHandler.processHandler(order3);
    }
}
