package learn_design_patterns.creational.abstract_factory.drink_factory_example.restaurant_drink_factory;

import learn_design_patterns.creational.abstract_factory.drink_factory_example.drinks.ADrink;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.drinks.Drink;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.ingredients.AIngredient;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.ingredients.Ingredient;

public class RestaurantADrinkFactory implements DrinkFactory {

    @Override
    public Drink createDrink() {
        return new ADrink();
    }

    @Override
    public Ingredient createIngredient() {
        return new AIngredient();
    }
}
