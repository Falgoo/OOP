package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.furniture_factory;

import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.chair.Chair;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.chair.ModernChair;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.coffee_table.CoffeeTable;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.coffee_table.ModernCoffeeTable;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.sofa.ModernSofa;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.sofa.Sofa;

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
