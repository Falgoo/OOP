package nguyenxuannghia_20001954.lab10.patterns.decorator.exercise2;

public abstract class ToppingDecorator implements IceCream {
    IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription();
    };

    public abstract String addTopping();
}
