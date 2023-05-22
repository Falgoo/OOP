package nguyenxuannghia_20001954.lab11.factory_method.exercise3;

public class CallingClass {

    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit fruit1 = fruitFactory.provideFruit("orange");
        fruit1.produceJuice();

        Fruit fruit2 = fruitFactory.provideFruit("banana");
        fruit2.produceJuice();
    }
}
