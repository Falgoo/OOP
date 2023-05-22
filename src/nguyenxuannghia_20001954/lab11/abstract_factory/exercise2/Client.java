package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2;

import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.furniture_factory.Furniture_Factory;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.chair.Chair;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.coffee_table.CoffeeTable;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.sofa.Sofa;

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
