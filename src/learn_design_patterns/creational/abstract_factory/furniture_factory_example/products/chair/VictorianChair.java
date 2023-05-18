package learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.chair;

public class VictorianChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("has 6 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("gold");
    }
}
