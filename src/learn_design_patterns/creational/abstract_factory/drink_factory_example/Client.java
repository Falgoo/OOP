package learn_design_patterns.creational.abstract_factory.drink_factory_example;

import learn_design_patterns.creational.abstract_factory.drink_factory_example.drinks.Drink;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.ingredients.Ingredient;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.restaurant_drink_factory.DrinkFactory;

public class Client {
    private DrinkFactory drinkFactory;

    public Client(DrinkFactory drinkFactory) {
        this.drinkFactory = drinkFactory;
    }

    public void prepareDrink() {
        Drink drink = drinkFactory.createDrink();
        Ingredient ingredient = drinkFactory.createIngredient();

        drink.prepare();
        ingredient.add();
    }
}
