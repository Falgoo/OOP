package nguyenxuannghia_20001954.lab10.patterns.decorator.exercise2;

public class Application {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateCream();
        System.out.println(iceCream.getDescription());

        ToppingDecorator nutIceCream = new NutsToppingDecorator(iceCream);
        System.out.println(nutIceCream.getDescription());
    }
}
