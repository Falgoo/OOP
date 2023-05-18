package learn_design_patterns.creational.abstract_factory.furniture_factory_example.furniture_factory;

import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.chair.Chair;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.chair.VictorianChair;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.coffee_table.CoffeeTable;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.coffee_table.VictoryCoffeeTable;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.sofa.Sofa;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.sofa.VictorySofa;

public class VictoryFurnitureFactory implements Furniture_Factory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorySofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictoryCoffeeTable();
    }
}
