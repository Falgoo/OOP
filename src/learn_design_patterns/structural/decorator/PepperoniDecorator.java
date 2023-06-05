package learn_design_patterns.structural.decorator;

public class PepperoniDecorator extends PizzaDecorator {

    public PepperoniDecorator(Pizza decoration) {
        super(decoration);
    }

    @Override
    public String description() {
        return super.description() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

}
