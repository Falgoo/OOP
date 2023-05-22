package learn_design_patterns.structural.composite;

public class Computer extends AssetComponent {

    private String name;
    private double value;

    public Computer(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getDescription() {
        return name + " - Computer";
    }

    @Override
    public double getTotalValue() {
        return value;
    }
}
