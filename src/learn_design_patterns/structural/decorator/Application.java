package learn_design_patterns.structural.decorator;

public class Application {

    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.description());
        System.out.println(pizza.getCost());

        PizzaDecorator pizzaDecorator = new CheeseDecorator(pizza);
        PizzaDecorator pizzaDecorator1 = new PepperoniDecorator(pizzaDecorator);
        System.out.println(pizzaDecorator1.description());
        System.out.println(pizzaDecorator1.getCost());
    }
}
