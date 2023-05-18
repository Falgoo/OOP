package learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.sofa;

public class ArtDecoSofa implements Sofa {

    @Override
    public void hasLegs() {
        System.out.println("4 legs");
    }

    @Override
    public void hasColor() {
        System.out.println("Blue");
    }
}
