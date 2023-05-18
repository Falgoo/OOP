package learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.sofa;

public class VictorySofa implements Sofa {

    @Override
    public void hasLegs() {
        System.out.println("has 6 legs");
    }

    @Override
    public void hasColor() {
        System.out.println("Gold");
    }
}
