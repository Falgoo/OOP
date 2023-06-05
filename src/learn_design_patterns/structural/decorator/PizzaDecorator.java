package learn_design_patterns.structural.decorator;

public class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return pizza.description();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
