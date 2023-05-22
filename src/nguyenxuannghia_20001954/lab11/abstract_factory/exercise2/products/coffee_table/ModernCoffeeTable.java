package nguyenxuannghia_20001954.lab11.abstract_factory.exercise2.products.coffee_table;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void hasColors() {
        System.out.println("Black");
    }

    @Override
    public void shape() {
        System.out.println("Rectangle");
    }
}
