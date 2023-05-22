package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.chair;

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
