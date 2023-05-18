package learn_design_patterns.creational.abstract_factory.furniture_factory_example.furniture_factory;

import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.chair.Chair;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.coffee_table.CoffeeTable;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.sofa.Sofa;

public interface Furniture_Factory {

    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}
