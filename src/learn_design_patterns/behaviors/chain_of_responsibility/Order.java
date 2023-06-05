package learn_design_patterns.behaviors.chain_of_responsibility;

public class Order {

    private String id;
    private String type;

    public Order(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
