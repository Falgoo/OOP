package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.chair;

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
