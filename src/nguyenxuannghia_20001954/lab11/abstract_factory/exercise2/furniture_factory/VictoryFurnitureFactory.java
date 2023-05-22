package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.furniture_factory;

import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.chair.Chair;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.chair.VictorianChair;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.coffee_table.CoffeeTable;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.coffee_table.VictoryCoffeeTable;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.sofa.Sofa;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.sofa.VictorySofa;

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
