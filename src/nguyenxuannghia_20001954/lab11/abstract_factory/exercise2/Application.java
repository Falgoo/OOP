package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2;

import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.furniture_factory.Furniture_Factory;
import nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.furniture_factory.ModernFurnitureFactory;

public class Application {

    public static void main(String[] args) {
        Furniture_Factory furniture_factory = new ModernFurnitureFactory();
        Client client = new Client(furniture_factory);

        System.out.println("Order modern furniture");
        client.orderFurniture();
    }
}
