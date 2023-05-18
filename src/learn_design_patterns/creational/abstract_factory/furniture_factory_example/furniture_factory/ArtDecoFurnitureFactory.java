package learn_design_patterns.creational.abstract_factory.furniture_factory_example.furniture_factory;

import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.chair.ArtDecoChair;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.chair.Chair;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.coffee_table.ArtDecoCoffeeTable;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.coffee_table.CoffeeTable;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.sofa.ArtDecoSofa;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.sofa.Sofa;

public class ArtDecoFurnitureFactory implements Furniture_Factory {

    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
