package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.furniture_factory;

import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.chair.Chair;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.coffee_table.CoffeeTable;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.sofa.Sofa;

public interface Furniture_Factory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
