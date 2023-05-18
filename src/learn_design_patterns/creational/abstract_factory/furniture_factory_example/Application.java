package learn_design_patterns.creational.abstract_factory.furniture_factory_example;

import learn_design_patterns.creational.abstract_factory.furniture_factory_example.furniture_factory.Furniture_Factory;
import learn_design_patterns.creational.abstract_factory.furniture_factory_example.furniture_factory.ModernFurnitureFactory;

public class Application {

    public static void main(String[] args) {
        Furniture_Factory furniture_factory = new ModernFurnitureFactory();
        Client client = new Client(furniture_factory);
        client.orderFurniture();
    }
}
