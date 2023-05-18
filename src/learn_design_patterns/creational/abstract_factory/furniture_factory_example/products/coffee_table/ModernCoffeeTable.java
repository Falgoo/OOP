package learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.coffee_table;

public class ModernCoffeeTable implements CoffeeTable {

    @Override
    public void hasColors() {
        System.out.println("Black");
    }

    @Override
    public void shape() {
        System.out.println("Rectangle");
    }
}
