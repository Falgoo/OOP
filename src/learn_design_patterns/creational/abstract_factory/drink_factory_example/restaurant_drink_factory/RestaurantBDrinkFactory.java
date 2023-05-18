package learn_design_patterns.creational.abstract_factory.drink_factory_example.restaurant_drink_factory;

import learn_design_patterns.creational.abstract_factory.drink_factory_example.drinks.BDrink;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.drinks.Drink;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.ingredients.BIngredient;
import learn_design_patterns.creational.abstract_factory.drink_factory_example.ingredients.Ingredient;

public class RestaurantBDrinkFactory implements DrinkFactory {

    @Override
    public Drink createDrink() {
        return new BDrink();
    }

    @Override
    public Ingredient createIngredient() {
        return new BIngredient();
    }
}
