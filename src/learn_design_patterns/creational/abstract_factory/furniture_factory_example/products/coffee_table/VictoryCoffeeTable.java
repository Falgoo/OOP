package learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.coffee_table;

public class VictoryCoffeeTable implements CoffeeTable {

    @Override
    public void hasColors() {
        System.out.println("Gold");
    }

    @Override
    public void shape() {
        System.out.println("Circle");
    }
}
