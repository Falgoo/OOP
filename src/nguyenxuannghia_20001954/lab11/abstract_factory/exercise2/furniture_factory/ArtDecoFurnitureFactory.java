package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.furniture_factory;

import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.chair.ArtDecoChair;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.chair.Chair;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.coffee_table.ArtDecoCoffeeTable;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.coffee_table.CoffeeTable;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.sofa.ArtDecoSofa;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.sofa.Sofa;

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
