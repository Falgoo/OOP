package learn_design_patterns.creational.abstract_factory.drink_factory_example.drinks;

public class ADrink implements Drink {

    @Override
    public void prepare() {
        System.out.println("Prepare drink A");
    }
}
