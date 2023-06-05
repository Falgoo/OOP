package learn_design_patterns.structural.decorator;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza decoration) {
        super(decoration);
    }

    @Override
    public String description() {
        return super.description() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.0;
    }
}
