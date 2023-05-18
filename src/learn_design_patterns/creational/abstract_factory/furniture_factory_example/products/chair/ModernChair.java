package learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.chair;

public class ModernChair implements Chair {

    @Override
    public void hasLegs() {
        System.out.println("has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("cotton");
    }
}
