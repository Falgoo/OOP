package learn_design_patterns.creational.abstract_factory.drink_factory_example.restaurant_drink_factory;

import learn_design_patterns.creational.abstract_factory.drink_factory_example.drinks.Drink;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.ingredients.Ingredient;

public interface DrinkFactory {

    Drink createDrink();
    Ingredient createIngredient();
}
