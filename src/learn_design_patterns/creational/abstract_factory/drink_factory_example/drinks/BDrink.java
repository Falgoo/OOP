package learn_design_patterns.creational.abstract_factory.drink_factory_example.drinks;

public class BDrink implements Drink {

    @Override
    public void prepare() {
        System.out.println("Prepare drink B");
    }
}
