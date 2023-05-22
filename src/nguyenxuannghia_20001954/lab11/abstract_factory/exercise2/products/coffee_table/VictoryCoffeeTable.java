package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.coffee_table;

public class VictoryCoffeeTable implements CoffeeTable {
    @Override
    public void hasColors() {
        System.out.println("Gold");
    }

    @Override
    public void shape() {
        System.out.println("Circle");
    }
}
