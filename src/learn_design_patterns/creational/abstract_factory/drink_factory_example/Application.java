package learn_design_patterns.creational.abstract_factory.drink_factory_example;

import learn_design_patterns.creational.abstract_factory.drink_factory_example.restaurant_drink_factory.DrinkFactory;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.restaurant_drink_factory.RestaurantADrinkFactory;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.restaurant_drink_factory.RestaurantBDrinkFactory;

public class Application {

    public static void main(String[] args) {
        DrinkFactory restaurantADrinkFactory = new RestaurantADrinkFactory();
        DrinkFactory restaurantBDrinkFactory = new RestaurantBDrinkFactory();

        Client client1 = new Client(restaurantADrinkFactory);
        client1.prepareDrink();

        Client client2 = new Client(restaurantBDrinkFactory);
        client2.prepareDrink();
    }
}
