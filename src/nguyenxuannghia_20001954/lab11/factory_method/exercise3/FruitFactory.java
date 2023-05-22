package nguyenxuannghia_20001954.lab11.factory_method.exercise3;

public class FruitFactory {

    public Fruit provideFruit(String type) {
        return switch (type) {
            case "orange" -> new Orange();
            case "banana" -> new Banana();
            case "apple" -> new Apple();
            default -> null;
        };
    }
}
