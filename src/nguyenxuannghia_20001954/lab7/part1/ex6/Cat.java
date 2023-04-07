package nguyenxuannghia_20001954.lab7.part1.ex6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
