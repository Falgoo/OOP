package learn_design_patterns.structural.decorator;

public class PlainPizza implements Pizza {
    @Override
    public String description() {
        return "Plain pizza";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
