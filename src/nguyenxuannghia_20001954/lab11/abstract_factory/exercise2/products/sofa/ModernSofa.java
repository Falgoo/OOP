package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.sofa;

public class ModernSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("has 4 legs");
    }

    @Override
    public void hasColor() {
        System.out.println("Black");
    }
}
