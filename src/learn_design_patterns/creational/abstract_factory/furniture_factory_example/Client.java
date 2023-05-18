package learn_design_patterns.creational.abstract_factory.furniture_factory_example;

import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.chair.Chair;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.coffee_table.CoffeeTable;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.furniture_factory.Furniture_Factory;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.products.sofa.Sofa;

public class Client {

    Furniture_Factory furniture_factory;

    public Client(Furniture_Factory furniture_factory) {
        this.furniture_factory = furniture_factory;
    }

    public void orderFurniture() {
        Chair chair = furniture_factory.createChair();
        Sofa sofa = furniture_factory.createSofa();
        CoffeeTable coffeeTable = furniture_factory.createCoffeeTable();

        chair.hasLegs();
        chair.sitOn();

        sofa.hasColor();
        sofa.hasLegs();

        coffeeTable.hasColors();
        coffeeTable.shape();
    }
}
