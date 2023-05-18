package learn_design_patterns.creational.abstract_factory.furniture_factory_example.furniture_factory;

import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.chair.Chair;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.chair.ModernChair;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.coffee_table.CoffeeTable;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.coffee_table.ModernCoffeeTable;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.sofa.ModernSofa;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.sofa.Sofa;

public class ModernFurnitureFactory implements Furniture_Factory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
